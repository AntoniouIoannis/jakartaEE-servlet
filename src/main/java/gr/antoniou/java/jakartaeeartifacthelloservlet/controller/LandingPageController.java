package gr.antoniou.java.jakartaeeartifacthelloservlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.script.ScriptContext;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/coding-factory")
public class LandingPageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
    }


}
