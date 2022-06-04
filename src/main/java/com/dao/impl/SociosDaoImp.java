package com.dao.impl;

import com.exceptions.GenericException;
import com.vo.Socios;

import java.sql.SQLException;
import java.util.Collection;

public class SociosDaoImp {

	public static Collection<Socios> findAll() throws GenericException, SQLException {
		EnviarQuery findall = new EnviarQuery();
		Collection<Socios> listaSocios=EnviarQuery.enviarQueryConsulta();
		
		return listaSocios;
	}
	
}
