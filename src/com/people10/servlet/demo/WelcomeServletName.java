package com.people10.servlet.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.people10.service.demo.WelcomeService;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServletName")
public class WelcomeServletName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServletName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WelcomeService welcomeService = new WelcomeService();
		
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Anjoe");
		request.setAttribute("myWelcomeMessage", welcomeMessage);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeName.jsp");
		
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

