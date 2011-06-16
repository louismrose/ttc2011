package simulator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import simulator.model.Watch;

@SuppressWarnings("serial")
public abstract class AbstractServlet extends HttpServlet {

	protected void render(String templateName, HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(templateName).forward(req, resp);
	}

	protected Watch getOrCreateWatch(HttpSession session) {
		if (session.getAttribute("watch") == null) {
			session.setAttribute("watch", Watch.createDefaultWatch());
		}
		
		return (Watch)session.getAttribute("watch");
	}
	
	protected void setWatch(Watch watch, HttpSession session) {
		session.setAttribute("watch", watch);
	}
}
