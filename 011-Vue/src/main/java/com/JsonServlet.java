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
 * @author : ��С��
 * @date : 2022-02-06 14:51
 **/
@WebServlet("/text02.do")
public class JsonServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.���������������п��ܴܺ�����Servlet��׼�����API��ʱ��Ҫ������ͨ������������ȡ
        BufferedReader reader = req.getReader();

        // 2.����StringBuilder�������ۼӴ洢���������ж�ȡ����ÿһ��
        // StringBuilder��:��̬����string�ĸ�Ч��ʽ
        StringBuilder builder = new StringBuilder();

        // 3.������ʱ����
        String bufferStr = null;

        // 4.ѭ����ȡ
        while((bufferStr = reader.readLine()) != null) {
            builder.append(bufferStr);
        }

        // 5.�ر���
        reader.close();

        // 6.�ۼӵĽ����������������
        bufferStr= builder.toString();
        System.out.println(bufferStr);

        Gson gson = new Gson();
        Student s1 = gson.fromJson(bufferStr, Student.class);
        System.out.println(s1);
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("�������˷�����ͨ�ı��ַ�����Ϊ��Ӧ");
    }
}
