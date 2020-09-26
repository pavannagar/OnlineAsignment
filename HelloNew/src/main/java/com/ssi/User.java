package com.ssi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class User
 */
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
System.out.print("enter in servlet");
		
		String name=request.getParameter("name");
		String no=request.getParameter("no");
		
		Teacher teacher=new Teacher(name, no);
		
	try {
		System.out.print("enter in servlet");
		
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	
		
		Session session=sessionfactory.openSession();
		
		Transaction tr=(Transaction) session.beginTransaction();
		session.save(teacher);
		tr.commit();
		session.close();
		
		System.out.println("Data Saves Successfully Teacher");
	
		
	}catch (Exception e) {
		e.printStackTrace();
	}	
		
	}
		
		
	}


