//8b. Build a servlet program to  create a cookie to get your name through text box and press submit button( through HTML) 
//to display the message by greeting Welcome back your name ! , you have visited this page n times ( n = number of your visit )
//along with the list of cookies and its setvalues and demonstrate the expiry of cookie also. 

package com.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String user = null;
        int count = 0;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) user = c.getValue();
                if (c.getName().equals("count")) count = Integer.parseInt(c.getValue());
            }
        }

        out.println("<html><body>");

        if (user != null) {

            count++;

            Cookie countCookie = new Cookie("count", String.valueOf(count));
            countCookie.setMaxAge(60);

            response.addCookie(countCookie);

            out.println("<h2>Welcome back " + user + "</h2>");
            out.println("<h3>You have visited " + count + " times</h3>");

            out.println("<h3>Cookie List:</h3>");
            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("Name: " + c.getName() + " Value: " + c.getValue() + "<br>");
                }
            }

        } else {
            out.println("<h2>Session expired or first visit</h2>");
            out.println("<a href='index.html'>Login again</a>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");

        Cookie userCookie = new Cookie("user", name);
        userCookie.setMaxAge(60);

        Cookie countCookie = new Cookie("count", "0");
        countCookie.setMaxAge(60);

        response.addCookie(userCookie);
        response.addCookie(countCookie);

        response.sendRedirect("CookieServlet");
    }
}
