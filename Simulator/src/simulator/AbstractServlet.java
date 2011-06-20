package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import simulator.config.Configuration;
import simulator.execution.model.Simulation;
import simulator.model.factory.FileBasedWatchFactory;

@SuppressWarnings("serial")
public abstract class AbstractServlet extends HttpServlet {

	protected void render(String templateName, HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(templateName).forward(req, resp);
	}

	protected Simulation getOrCreateState(HttpSession session) throws IOException {
		if (session.getAttribute("state") == null) {
			final Configuration config = new FileBasedWatchFactory().createConfiguration();
			session.setAttribute("state", new Simulation(config));
		}
		
		return (Simulation)session.getAttribute("state");
	}
	
	protected void update(Simulation state, HttpSession session) {
		session.setAttribute("state", state);
	}
}
