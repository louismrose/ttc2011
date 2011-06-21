package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.config.Configuration;
import simulator.execution.model.Simulation;
import simulator.model.factory.UploadedWatchFactory;

@SuppressWarnings("serial")
public class ConfigureServlet extends AbstractServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final Configuration configuration = new UploadedWatchFactory(req).createConfiguration();
		update(new Simulation(configuration), req.getSession());
		render("watch.jsp", req, resp);
	}
}
