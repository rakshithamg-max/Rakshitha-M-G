package com.cookieservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = null;
        int count = 0;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    user = c.getValue();
                }
                if (c.getName().equals("count")) {
                    try {
                        count = Integer.parseInt(c.getValue());
                    } catch (Exception e) {
                        count = 0;
                    }
                }
            }
        }

        out.println("<html>");
        out.println("<head><title>Cookie Program</title></head>");
        out.println("<body>");

        if (user != null) {

            count++;

            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(60);
            response.addCookie(countCookie);

            out.println("<h2>Welcome back, " + user + "</h2>");
            out.println("<h2>You have visited this page " + count + " times</h2>");

        } else {

            out.println("<h2 style='color:red;'>Welcome Guest! you have been logged out or kindly login first time</h2>");
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='text' name='userName' required>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("userName");

        Cookie userCookie = new Cookie("user", userName);
        userCookie.setMaxAge(60);

        Cookie countCookie = new Cookie("count", "0");
        countCookie.setMaxAge(60);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}
