<%@page import="simulator.execution.model.state.VariableWithValue"%>
<%@page import="simulator.config.Button"%>
<%@page import="simulator.config.factory.FileBasedConfigurationFactory"%>
<%@page import="simulator.execution.model.Simulation"%>
<%@page import="simulator.config.Configuration"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="simulator.trace.presenter.TraceElementPresenter"%>
<%@page import="simulator.trace.TraceElement"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<%
	if (session.getAttribute("state") == null) {
		final Configuration configuration = new FileBasedConfigurationFactory().createConfiguration();
		session.setAttribute("state", new Simulation(configuration));
	}
	
	final Simulation simulation = (Simulation)session.getAttribute("state");
%>
<body>
	<div id="debug">
		<p><%=session.getId()%> : <%=session.getCreationTime()%></p>
	</div>
	<div id="simulation">
	  <div id="outputs">
	    <span id="time">
	      <%=simulation.getDisplayText()%>
	    </span>
	    <span id="indicator">
	      <b>Indicator:</b>
	      <%=simulation.getIndicatorText()%>
	    </span>
	    <span id="mode">
	      <b>Mode:</b> <%=simulation.getCurrentMode().getName()%>
	    </span>
	    <span id="alarm_status">
	      <b>Alarm:</b> <%=simulation.getAlarmStatus()%>
	    </span>
	  </div>
	
	  <div id="buttons">
	  	<h3>Buttons</h3>
	  	
	    <ul>
	    <% int buttonIndex = 0; %>
	    <% for (Button button : simulation.getCurrentMode().getButtons()) { %>
	      <li><a href="/button?id=<%=buttonIndex%>"/><%=button.getName()%></a></li>
	    <% 	buttonIndex++; %>
	    <% } %>
	    </ul>
	  </div>
	  
	  <div id="variables">
	  	<h3>Variables</h3>
	  
	    <table>
	    	<tr>
	    		<th>Name</th>
	    		<th>Value</th>
	    		<th>Controls</th>
	    	</tr>
	    	<% int variableIndex = 0; %>
			<% for (VariableWithValue variable : simulation.getVariableValues()) { %>
			<tr>
				<td><%=variable.getName()%></td>
				<td><%=variable.getValue()%></td>
				<td>
				    <a href="/variables?name=<%=variable.getName()%>&command=hour">+1 hour</a>
				    <a href="/variables?name=<%=variable.getName()%>&command=minute">+1 minute</a>
				</td>
			</tr>
			<% 	variableIndex++; %>
			<% } %>
	    </table>
	  </div>
	  
	  <div id="configuration">
	    <h3>Upload new configuration</h3>
	      
		<form action="/configure?name=load" enctype="multipart/form-data" method="POST">
			<input type="file" name="model"/>
			<input type="Submit" value="Upload File"/>
		</form>
	  </div>
  </div>
  
  <div id="output">
  	<h2>Simulation Output</h2>
  	<ul id="trace">
  		<% int index = 0;
  		   final List<TraceElement> elements = new LinkedList<TraceElement>(simulation.getTrace().getElements());
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