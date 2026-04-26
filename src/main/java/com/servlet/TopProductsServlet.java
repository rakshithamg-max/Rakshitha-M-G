package com.servlet;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/topProducts")
public class TopProductsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int limit = Integer.parseInt(request.getParameter("limit"));

            List<Product> list = ProductDAO.getTopProducts(limit);

            request.setAttribute("list", list);

            request.getRequestDispatcher("report_result.jsp")
                   .forward(request, response);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}