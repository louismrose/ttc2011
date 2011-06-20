package simulator;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.config.Configuration;
import simulator.execution.model.Simulation;
import simulator.model.factory.FileBasedWatchFactory;
import simulator.model.factory.UploadedWatchFactory;
import simulator.util.EmfUtil;

@SuppressWarnings("serial")
public class ControlsServlet extends AbstractServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final Simulation state = getOrCreateState(req.getSession());
		
		final String controlType = req.getParameter("name");
		
		if ("advance".equals(controlType)) {		
			state.advanceTime(Calendar.HOUR);
			update(state, req.getSession());
			render("watch.jsp", req, resp);
			
		} else if ("trace".equals(controlType)) {
			resp.setContentType("text/xml");
			EmfUtil.serialise(state.getTrace(), resp.getOutputStream());		
		
		} else if ("load".equals(controlType)) {
			final Configuration configuration = new FileBasedWatchFactory().createConfiguration();
			update(new Simulation(configuration), req.getSession());
			render("watch.jsp", req, resp);
		}
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final Configuration configuration = new UploadedWatchFactory(req).createConfiguration();
		update(new Simulation(configuration), req.getSession());
		render("watch.jsp", req, resp);
	}
}
