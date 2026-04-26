 package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.dao.ProductDAO;
@WebServlet("/display")
public class DisplayProductsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            request.setAttribute("list", ProductDAO.getAllProducts());
            RequestDispatcher rd = request.getRequestDispatcher("productdisplay.jsp");
            rd.forward(request, response);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}