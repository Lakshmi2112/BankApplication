package com.lakshmi.web;

import java.io.IOException;
import java.util.ArrayList;

import com.lakshmi.web.dao.*;
import com.lakshmi.web.models.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TransactionCtrler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		TransactionDao dao = new TransactionDao();
		ArrayList<Transaction> transactions = dao.getTransaction();
		request.setAttribute("transaction", transactions);
		RequestDispatcher rd = request.getRequestDispatcher("showTransactions.jsp");
		rd.forward(request, response);
		
	}
}
