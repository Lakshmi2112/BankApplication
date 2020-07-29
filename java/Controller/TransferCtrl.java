package com.lakshmi.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lakshmi.web.dao.*;
import com.lakshmi.web.models.*;

public class TransferCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		TransferDao dao = new TransferDao();
		Customer customer = dao.transfer(Float.parseFloat(request.getParameter("amt")));
		request.setAttribute("customer",customer);
		RequestDispatcher rd = request.getRequestDispatcher("showTransfer.jsp");
		rd.forward(request, response);
	}

}
