package com.rudoy.http.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Stream;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramValue = req.getParameter("param");
        Map<String, String[]> parameterMap = req.getParameterMap();

        resp.setContentType("text/html; charset=UTF-8");
        resp.setHeader("token", "1488");
        try (PrintWriter writer = resp.getWriter()) {
            writer.write("<h1>Привет с первого сервлета</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try (BufferedReader reader = req.getReader();
             Stream<String> stringStream = reader.lines()) {
            stringStream.forEach(System.out::println);
        }
//        Map<String, String[]> parameterMap = req.getParameterMap();
//        System.out.println(parameterMap);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
