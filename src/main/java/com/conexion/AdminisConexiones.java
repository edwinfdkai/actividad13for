package com.conexion;



import com.exceptions.GenericException;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminisConexiones {
	public static Connection obtenerConexion12() throws GenericException {
		String url = "jdbc:mysql://127.0.0.1:3306/actividad13?serverTimezone=UTC&userSSL=false";
		String user = "root";
		String password = "root";
		String diverName  = "com.mysql.cj.jdbc.Driver";
		
		try {
			//com.mysql.cj.jdbc.Driver.class.newInstance();
			Class.forName(diverName);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (Exception  e) {
			throw new GenericException("Error oteniendo conexion: " + e.getMessage(),e);
		} 
	}
	
	public static void main(String[] args) {
		
		try (Connection con = AdminisConexiones.obtenerConexion12();) {			
			System.out.println("Conexion obtenida");
		}catch (Exception e) {			
			e.printStackTrace();
		}

}

}
