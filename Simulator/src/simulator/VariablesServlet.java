package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.config.UnitOfTime;
import simulator.execution.model.Simulation;

@SuppressWarnings("serial")
public class VariablesServlet extends AbstractServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		final Simulation simulation = getOrCreateState(req.getSession());
		
		final String variableName = req.getParameter("name");
		final UnitOfTime unit = "hour".equals(req.getParameter("command")) ? UnitOfTime.HOUR : UnitOfTime.MINUTE;
		
		simulation.incrementVariable(variableName, unit);
		update(simulation, req.getSession());
		
		render("watch.jsp", req, resp);
		
//		if ("trace".equals(req.getParameter("name"))) {
//			resp.setContentType("text/xml");
//			EmfUtil.serialise(state.getTrace(), resp.getOutputStream());		
//		}
	}
}
