<%@page import="simulator.srl.SimulationElement"%>
<%@page import="simulator.SessionManager"%>
<%@page import="simulator.execution.model.state.VariableWithValue"%>
<%@page import="simulator.scl.Button"%>
<%@page import="simulator.execution.model.Simulation"%>
<%@page import="simulator.scl.Configuration"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="simulator.presenter.SimulationElementPresenter"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<%
	final Simulation simulation = new SessionManager(session).getOrCreateSimulation();
%>
<body>
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
	    <%
	    	int buttonIndex = 0;
	    %>
	    <%
	    	for (Button button : simulation.getCurrentMode().getButtons()) {
	    %>
	      <li><a href="/button?id=<%=buttonIndex%>"/><%=button.getName()%></a></li>
	    <%
	    	buttonIndex++;
	    %>
	    <%
	    	}
	    %>
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
	    	<%
	    		int variableIndex = 0;
	    	%>
			<%
				for (VariableWithValue variable : simulation.getVariableValues()) {
			%>
			<tr>
				<td><%=variable.getName()%></td>
				<td><%=variable.getValue()%></td>
				<td>
				    <a href="/variables?name=<%=variable.getName()%>&command=hour">+1 hour</a>
				    <a href="/variables?name=<%=variable.getName()%>&command=minute">+1 minute</a>
				</td>
			</tr>
			<%
				variableIndex++;
			%>
			<%
				}
			%>
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
  	<h2>Simulation Results</h2>
  	<ul id="trace">
  		<%
  			int index = 0;
  		  		  		   final List<SimulationElement> elements = new LinkedList<SimulationElement>(simulation.getResults().getElements());
  		  		  		   Collections.reverse(elements);
  		%>
  		<%
  			for (SimulationElement element : elements) {
  		%>
  			<%
  				if (index < 10) {
  			%>
  				<li><%=SimulationElementPresenter.present(element)%></li>
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
  		<a href="/trace"/>Download as EMF model</a>
  	</p>
  </div>
</body>
</html>