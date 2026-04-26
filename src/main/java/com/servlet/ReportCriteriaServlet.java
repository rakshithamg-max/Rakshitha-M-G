package com.servlet;

import javax.servlet.*;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/reportCriteria")
public class ReportCriteriaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.getRequestDispatcher("report_form.jsp").forward(request, response);
    }
}