<!DOCTYPE html>

<%@page import="aduran.com.vo.EnumOcupaciones"%>
<%@page import="java.util.ArrayList"%>
<html>
<body>
<h2>Formulario Inscripción Socios</h2>
		<form action="<%=request.getContextPath()%>/JohaoServlet" method="POST">
	  
	  <div class="mb-3">
	    <label for="documento" class="form-label">No. Documento</label>
	    <input type="number" name="documento" required="required" class="form-control" id="documento" aria-describedby="emailHelp">
	  </div>
	  
	  <div class="mb-3">
	    <label for="nombre" class="form-label">Nombre</label>
	    <input type="text" name="nombre" required="required" class="form-control" id="nombre" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="apellido" class="form-label">Apellido</label>
	    <input type="text" name="apellido" required="required" class="form-control" id="apellido">
	  </div>
	  <div class="mb-3">
	    <label for="edad" class="form-label">Edad</label>
	    <input type="number" name="edad" required="required" class="form-control" id="edad">
	  </div>
	  <div class="mb-3">
	    <label for="ocupacion" class="form-label">Ocupación</label>
	    <select name="ocupacion" required="required">
	    <% 		ArrayList<EnumOcupaciones> ocu = new ArrayList<EnumOcupaciones>();
	    		ocu.add(EnumOcupaciones.Desarrollador);
	    		ocu.add(EnumOcupaciones.Financiero);
	    		ocu.add(EnumOcupaciones.Ingeniero);
	    		ocu.add(EnumOcupaciones.Profesional);
	    		ocu.add(EnumOcupaciones.Otros);
	    		
	    		for(EnumOcupaciones enumocu: ocu){
	    			out.print("<option value="+ enumocu+">" +enumocu+ "</option>");
	    		}
	    		
	    %>
	    
	    </select>
	  </div>
	  <div class="mb-3">
	    <label for="fecha" class="form-label">Fecha de Nacimiento</label>
	    <input type="date" name="fecha" required="required" class="form-control" id="fecha">
	  </div>
	  
	  
	  <button type="submit" class="btn btn-primary">enviar</button>
	</form>	
	
		
</body>
</html>
