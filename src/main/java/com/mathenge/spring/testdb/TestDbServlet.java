package com.mathenge.spring.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "TestDbServlet", urlPatterns = {"/TestDbServlet"})
public class TestDbServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //DB connection creds
        String user = "springtest";
        String pass = "springtest";

        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/web_customer_tracker?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        //Connect to DB
        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to DB : " + jdbcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("Connection successfull");

            myConn.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
