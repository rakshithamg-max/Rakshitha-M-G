 package com.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Date;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        // Set session timeout to 1 minute
        session.setMaxInactiveInterval(60);

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Creation Time: " + new Date(session.getCreationTime()) + "</p>");
        out.println("<p>Last Access Time: " + new Date(session.getLastAccessedTime()) + "</p>");
        out.println("<p>Visit Count: " + count + "</p>");
        out.println("<p><b>Session expires after 1 minute of inactivity</b></p>");
        out.println("</body></html>");
    }
}
