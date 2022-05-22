package com.serlvets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * javaweb
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-04-25 08:46
 **/
@WebServlet("/index")
public class httpdemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("hello world!!Ôøºè½Ü");
        writer.flush();
    }
}
