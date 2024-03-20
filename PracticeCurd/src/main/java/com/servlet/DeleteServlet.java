package com.servlet;

import java.io.IOException;

import com.conn.DBConnect;
import com.dao.PersonDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		PersonDao dao=new PersonDao(DBConnect.getconn());
		HttpSession session=req.getSession();
		boolean f=dao.deletePerson(id);

		if (f) {
			session.setAttribute("succMsg", "Person Delete successfully....");
			resp.sendRedirect("index.jsp");
			System.out.println("Employee Detail Submitted successfully");
			
			
		}else {
			session.setAttribute("errorMsg", "Something Wrong....");
			resp.sendRedirect("index.jsp");
			System.out.println("Something wronh on server");
			
		}
		
	}

	

}
