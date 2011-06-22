package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import simulator.execution.model.Simulation;

@SuppressWarnings("serial")
public abstract class AbstractServlet extends HttpServlet {

	protected void render(String templateName, HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(templateName).forward(req, resp);
	}

	protected Simulation getOrCreateSimulation(HttpSession session) throws IOException {
		return new SessionManager(session).getOrCreateSimulation();
	}
	
	protected void update(Simulation simulation, HttpSession session) {
		new SessionManager(session).update(simulation);
	}
}
