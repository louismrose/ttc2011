package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.execution.model.Simulation;

@SuppressWarnings("serial")
public class ButtonServlet extends AbstractServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final String id = req.getParameter("id");
		
		if (id != null) {
			final Simulation state = getOrCreateState(req.getSession());
			state.pressButton(Integer.parseInt(id));
			update(state, req.getSession());
		}

		render("watch.jsp", req, resp);
	}
}
