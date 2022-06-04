<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="aduran.com.vo.Socios"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Presentación de Formulario</title>
</head>
<body>

<h1>Registro Exitoso</h1>
<h2>A continuación la lista de socios creados...</h2>

<table class="table" border="1">
  <thead>
    <tr>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">Ocupacion</th>
      <th scope="col">Años</th>
      <th scope="col">Documento</th>
      <th scope="col">Fecha de Nacimiento</th>
    </tr>
  </thead>
  
  	 <tbody>
	<%Map <Integer, Socios> listado = (HashMap<Integer, Socios>) request.getAttribute("MAPA"); %>
 	<% Iterator<Integer> mapSocios = listado.keySet().iterator(); 
 	
 	while(mapSocios.hasNext()){
		Integer key = mapSocios.next();
		Socios socio= listado.get(key);
		out.print(
		"<tr>"+
		"<td>"+socio.getNombre()+"</td>"+
		"<td>"+socio.getApellido()+"</td>"+
		"<td>"+socio.getOcupacion()+"</td>"+
		"<td>"+socio.getEdad()+"</td>"+
		"<td>"+socio.getDocumento()+"</td>"+
		"<td>"+socio.getFechaNac()+"</td>"+ 
		"</tr>"
		);
	}
	
	%>
 	 </tbody>
  	
</table>


<a href="<%= request.getContextPath()%>/index.jsp"><button >Volver</button></a>


</body>
</html>