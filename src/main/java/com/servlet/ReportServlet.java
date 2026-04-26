package com.servlet;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // GET INPUTS FROM FORM
            String category = request.getParameter("category");
            String priceStr = request.getParameter("price");

            double price = 0;

            //  SAFE PRICE CONVERSION
            if (priceStr != null && !priceStr.trim().isEmpty()) {
                price = Double.parseDouble(priceStr);
            }

            //  CALL DAO METHOD (FILTERED DATA)
            List<Product> list = ProductDAO.getFilteredProducts(category, price);

            // SEND DATA TO JSP
            request.setAttribute("list", list);

            RequestDispatcher rd = request.getRequestDispatcher("report_result.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}