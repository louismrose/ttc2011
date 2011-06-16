<%@page import="simulator.EObjectStore"%>
<%@page import="simulator.config.ConfigPackage"%>
<%@page import="simulator.EObjectSerialiser"%>
<%@page import="simulator.config.ConfigFactory"%>
<%@page import="simulator.config.NumberAndString"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="simulator.trace.presenter.TraceElementPresenter"%>
<%@page import="simulator.trace.TraceElement"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simulator.model.Watch"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<%
	/* if (session.getAttribute("debug") == null) {
		final NumberAndString ns = ConfigFactory.eINSTANCE.createNumberAndString();
		ns.setNumber(42);
		ns.setString("foo");
		session.setAttribute("debug", EObjectSerialiser.serialise(ns));
	}

	final NumberAndString debug = (NumberAndString)EObjectSerialiser.deserialise(ConfigPackage.eINSTANCE, session.getAttribute("debug").toString());
	session.setAttribute("debug", EObjectSerialiser.serialise(debug)); */
	
	final EObjectStore store = new EObjectStore(session, "debug");
	
	final NumberAndString ns = (NumberAndString)store.readOrCreate(ConfigPackage.eINSTANCE.getNumberAndString());
	ns.setNumber(ns.getNumber() + 1);
	store.update(ns);
%>
<body>
	<div id="debug">
		<p><%=session.getId()%> : <%=session.getCreationTime()%></p>
		<pre><code>
		<%=session.getAttribute("debug")%>
		</code></pre>
	</div>
	<h1><%=ns.getString()%> <%=ns.getNumber()%> (<%=ns.hashCode()%>)</h1>
</body>
</html>