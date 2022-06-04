<!DOCTYPE html>

<html>
<body>
<h2>Inscripcion realizada Correctamente</h2>
		<form action="<%=request.getContextPath()%>/FinalServlet" method="POST">
	
	<div class="form-check">
		  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
		  <label class="form-check-label" for="flexRadioDefault1">
		   Desea Inscribir mas Socios
	  </label>
</div>
	
	  
	  <button type="submit" class="btn btn-primary">Volver</button>
	</form>	
	
	
</body>
</html>
