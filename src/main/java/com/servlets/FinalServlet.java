package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FinalServlet")
public class FinalServlet extends HttpServlet {

	@Override	
	protected void doPost(HttpServletRequest entrada, HttpServletResponse salida) throws ServletException, IOException {
		
		String CheckJsp =entrada.getParameter("flexRadioDefault");
		String target1;
		if(CheckJsp != null) {
		
			target1 ="/index.jsp";
			getServletContext().getRequestDispatcher(target1).forward(entrada, salida);

		}
			target1 ="/formularioExitoso.jsp";
			getServletContext().getRequestDispatcher(target1).forward(entrada, salida);

				
	}
}
