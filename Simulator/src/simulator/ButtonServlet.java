package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.model.Watch;

@SuppressWarnings("serial")
public class ButtonServlet extends AbstractServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final String id = req.getParameter("id");
		
		if (id != null) {
			final Watch watch = getOrCreateWatch(req.getSession());
			watch.pressButton(Integer.parseInt(id));
			setWatch(watch, req.getSession());
		}

		render("watch.jsp", req, resp);
	}
}
