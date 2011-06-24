package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simulator.execution.model.Simulation;
import simulator.scl.Configuration;
import simulator.scl.factory.UploadedConfigurationFactory;

@SuppressWarnings("serial")
public class ConfigureServlet extends AbstractServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final Configuration configuration = new UploadedConfigurationFactory(req).createConfiguration();
		update(new Simulation(configuration), req.getSession());
		render("watch.jsp", req, resp);
	}
}
