package com.dao.impl;

import com.conexion.AdminisConexiones;
import com.exceptions.GenericException;
import com.vo.Socios;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class EnviarQuery {


public void enviarQueryCreate(Socios socio) throws GenericException, SQLException {
		
		Connection con = AdminisConexiones.obtenerConexion12();

		int estatus=0;
		int id1=socio.getDocumento();
		String nombre1= socio.getNombre();
		String apellido1= socio.getApellido();
		int edad=socio.getEdad();
		String ocupacion= socio.getOcupacion();
		String fechaNac=socio.getFechaNac();
	
		
	try {
		String query = "INSERT INTO socios (documento,nombre,apellido,edad,ocupacion,fechaNac) VALUES(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,id1);
		ps.setString(2, nombre1);
		ps.setString(3, apellido1);
		ps.setInt(4,edad);
		ps.setString(5, ocupacion);
		ps.setString(6, fechaNac);

		estatus = ps.executeUpdate();
		
		System.out.println("registro exitoso");
		
	} catch (Exception e) {
		System.out.println("error empleado");
	}
	
	con.close();
	}	
	
	
	public static Collection<Socios> enviarQueryConsulta() throws GenericException, SQLException {
		Connection con = AdminisConexiones.obtenerConexion12();
		
		//Statement / PreparedStatement: sql
		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery("select * from socios"); 
	
		Collection<Socios> lista = new ArrayList<>();
	
		//public Socios(int documento, String nombre, String apellido, int edad, String ocupacion, String fechaNac)
		while(res.next()) {
			//ResultSet: datos (columnas / filas)
			int documento = res.getInt("documento");//obtener un valor long de la columna 1
			String nombre = res.getString("nombre");
			String apellido = res.getString("apellido");
			int edad = res.getInt("edad");
			String ocupacion = res.getString("ocupacion");
			String fechaNac= res.getString("fechaNac");
			
			
			
			Socios socio = new Socios(documento, nombre ,apellido, edad,ocupacion,fechaNac);
			lista.add(socio);
		}
		con.close();
		return lista;
	}	
	


}
