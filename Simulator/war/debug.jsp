<%@page import="simulator.model.NumberAndString"%>
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
	if (session.getAttribute("debug") == null) {
		session.setAttribute("debug", new NumberAndString(42, "foo"));
	}

	final NumberAndString debug = (NumberAndString)session.getAttribute("debug");
	debug.increment();
	session.setAttribute("debug", debug);
%>
<body>
	<div id="debug"><p><%=session.getId()%> : <%=session.getCreationTime()%></p></div>
	<h1><%=debug.toString()%> (<%=debug.hashCode()%>)</h1>
</body>
</html>