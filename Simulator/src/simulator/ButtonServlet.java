package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import simulator.config.Configuration;
import simulator.execution.model.SimulationState;
import simulator.model.factory.FileBasedWatchFactory;

@SuppressWarnings("serial")
public class ButtonServlet extends AbstractServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final String id = req.getParameter("id");
		
		if (id != null) {
			final Configuration config = new FileBasedWatchFactory().createConfiguration();
			final SimulationState state = getOrCreateState(req.getSession(), config);
			state.pressButton(config, Integer.parseInt(id));
			
			final EObjectStore store = new EObjectStore(req.getSession(), "config");
			store.update(config);
		}

		render("watch.jsp", req, resp);
	}
	
	private SimulationState getOrCreateState(HttpSession session, Configuration config) {
		if (session.getAttribute("state") == null) {
			session.setAttribute("state", new SimulationState(config));
		}
		
		return (SimulationState)session.getAttribute("state");
	}
}
