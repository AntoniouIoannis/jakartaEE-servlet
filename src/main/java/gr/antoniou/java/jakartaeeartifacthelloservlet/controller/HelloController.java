package gr.antoniou.java.jakartaeeartifacthelloservlet.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class HelloController extends HttpServlet {
    private String message = "private String Hello World!";

    @Override
    public void init(ServletConfig config) throws ServletException {
        message = "Override Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Γειά σου κόσμε!</h1></body></html>");

    }
}
