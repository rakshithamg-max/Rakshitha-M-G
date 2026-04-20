//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure

package com.prime;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("number");

        try {
            int num = Integer.parseInt(input);

            if (num <= 1) {
                out.println("<h3>Not a Prime Number</h3>");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    out.println("<h3>" + num + " is a Prime Number</h3>");
                else
                    out.println("<h3>" + num + " is Not a Prime Number</h3>");
            }

        } catch (NumberFormatException e) {
            // Error handling (Invalid input)
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // 400 error
            out.println("<h3>Error: Invalid number entered!</h3>");
        }
    }
}
