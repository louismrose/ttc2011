package simulator;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		req.setAttribute("time", new Date());
		req.getRequestDispatcher("watch.jsp").forward(req, resp);
		
//		putTimeInDatastore();
//		resp.sendRedirect("watch.jsp");
	}

	@SuppressWarnings("unused")
	private void putTimeInDatastore() {
		final DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		final Key key = KeyFactory.createKey("Simulation", "theSimulation");
		
		final Entity entity;
		
		final Query query = new Query("Time", key);
	    if (datastore.prepare(query).countEntities(FetchOptions.Builder.withDefaults()) == 0) {
	    	entity = new Entity("Time", key);
	    } else {
	    	entity = datastore.prepare(query).asSingleEntity();
	    }
		
	    entity.setProperty("value", new Date());	    	
		
		datastore.put(entity);
	}
}
