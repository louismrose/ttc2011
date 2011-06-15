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
	if (session.getAttribute("watch") == null) {
		session.setAttribute("watch", new Watch());
	}

	final Watch watch = (Watch)session.getAttribute("watch");
%>
<body>
	<div id="debug"><p><%=session.getId()%> : <%=session.getCreationTime()%></p></div>
	<div id="simulation">
	  <div id="outputs">
	    <span id="time">
	      <%=watch.getDisplayText()%>
	    </span>
	    <span id="alarm_status">
	      <b>Alarm:</b>
	      <% if (watch.isAlarmTime()) { %>
	      	ringing!
	      <% } else if (watch.getAlarm().getIndicator().isShowing()) { %>
	      	prepared
	      <% } else { %>
	      	not prepared
	     <% } %>
	    </span>
	    <span id="mode">
	      <b>Mode:</b> <%=watch.getModes().getCurrentMode().getName()%>
	    </span>
	  </div>
	
	  <div id="buttons">
	  	<h3>Buttons</h3>
	  	
	    <ul>
	    <% int buttonIndex = 0; %>
	    <% for (String buttonName : watch.getModes().getCurrentMode().getButtonNames()) { %>
	      <li><a href="/button?id=<%=buttonIndex%>"/><%=buttonName%></a></li>
	    <%
	      buttonIndex = buttonIndex + 1;
	    }
	    %>
	    </ul>
	  </div>
	  
	  <div id="controls">
	  	<h3>Simulation Controls</h3>
	  
	    <ul>
			<li><a href="/controls?name=advance"/>Advance time</a></li>
			<li><a href="/controls?name=reset"/>Reset time</a></li>
			<li><a href="/controls?name=trace"/>Execute all test cases</a></li>
	    </ul>
	  </div>
	  
	  <div id="configuration">
	    <h3>Upload new configuration</h3>
	      
		<form action="/controls?name=load" enctype="multipart/form-data" method="POST">
			<input type="file" name="model"/>
			<input type="Submit" value="Upload File"/>
		</form>
	  </div>
  </div>
  
  <div id="output">
  	<h2>Simulation Output</h2>
  	<ul id="trace">
  		<% int index = 0;
  		   final List<TraceElement> elements = new LinkedList<TraceElement>(watch.getTrace().getElements());
  		   Collections.reverse(elements);
  		%>
  		<% for (TraceElement element : elements) { %>
  			<% if (index < 10) { %>
  				<li><%=TraceElementPresenter.present(element)%></li>
  			<% } else { %>
  				 <li>...</li>
  		    <% 
  		       	break;
  			   } %>
  		<%
  		   	index++;
  	  	   }
  		%>
  	</ul>
  	
  	<p>
  		<a href="/controls?name=trace"/>Download as EMF model</a>
  	</p>
  </div>
</body>
</html>