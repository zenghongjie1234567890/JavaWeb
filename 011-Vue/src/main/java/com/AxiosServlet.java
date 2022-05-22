package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * JavaWeb
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-02-06 13:07
 **/
@WebServlet("/text.do")
public class AxiosServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println(uname);
        System.out.println(pwd);
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset-utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write(uname+"_"+pwd);
    }
}
