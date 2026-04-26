package com.servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/update")

public class UpdateProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        try {
            Product p = new Product();

            p.setProductId(Integer.parseInt(request.getParameter("id")));
            p.setProductName(request.getParameter("name"));
            p.setCategory(request.getParameter("category"));
            p.setPrice(Double.parseDouble(request.getParameter("price")));
            p.setQuantity(Integer.parseInt(request.getParameter("quantity")));

            ProductDAO.updateProduct(p);

            response.sendRedirect("update_success.jsp");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}