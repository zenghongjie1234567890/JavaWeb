package com;

import bean.Student;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * JavaWeb
 *
 * @author : 曾小杰
 * @date : 2022-02-06 14:51
 **/
@WebServlet("/text02.do")
public class JsonServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.由于请求体数据有可能很大，所以Servlet标准在设计API的时候要求我们通过输入流来读取
        BufferedReader reader = req.getReader();

        // 2.创建StringBuilder对象来累加存储从请求体中读取到的每一行
        // StringBuilder和:动态创建string的高效方式
        StringBuilder builder = new StringBuilder();

        // 3.声明临时变量
        String bufferStr = null;

        // 4.循环读取
        while((bufferStr = reader.readLine()) != null) {
            builder.append(bufferStr);
        }

        // 5.关闭流
        reader.close();

        // 6.累加的结果就是整个请求体
        bufferStr= builder.toString();
        System.out.println(bufferStr);

        Gson gson = new Gson();
        Student s1 = gson.fromJson(bufferStr, Student.class);
        System.out.println(s1);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("服务器端返回普通文本字符串作为响应");
    }
}
