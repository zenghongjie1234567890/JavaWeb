package com;

import bean.Student;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * JavaWeb
 *
 * @author : 曾小杰
 * @date : 2022-02-06 14:51
 **/
@WebServlet("/text03.do")
public class JsonServlet02 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student01 = new Student("11","11");
        HashSet hashSet = new HashSet();
        hashSet.add(student01);
        // 2.创建Gson对象
        Gson gson = new Gson();

        // 3.将Java对象转换为JSON对象
        String json = gson.toJson(hashSet);

        // 4.设置响应体的内容类型
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().write(json);

    }
}
