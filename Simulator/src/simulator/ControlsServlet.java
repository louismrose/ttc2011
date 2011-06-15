package simulator;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.model.Watch;
import simulator.model.factory.FileBasedWatchFactory;
import simulator.model.factory.UploadedWatchFactory;
import simulator.util.EmfUtil;

@SuppressWarnings("serial")
public class ControlsServlet extends AbstractServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final Watch watch = getOrCreateWatch(req.getSession());
		
		final String controlType = req.getParameter("name");
		
		if ("advance".equals(controlType)) {		
			watch.getSimualtion().advanceTime(Calendar.HOUR);
			setWatch(watch, req.getSession());
			render("watch.jsp", req, resp);
			
		} else if ("trace".equals(controlType)) {
			resp.setContentType("text/xml");
			EmfUtil.serialise(watch.getTrace(), resp.getOutputStream());		
		
		} else if ("load".equals(controlType)) {
			setWatch(new FileBasedWatchFactory().createWatch(), req.getSession());
			render("watch.jsp", req, resp);
		}
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setWatch(new UploadedWatchFactory(req).createWatch(), req.getSession());
		render("watch.jsp", req, resp);
	}
}
