package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.ProductDAO;

@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            ProductDAO.deleteProduct(id);

            response.sendRedirect("delete_success.jsp");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}