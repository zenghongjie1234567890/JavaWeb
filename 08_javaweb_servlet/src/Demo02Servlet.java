import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JavaWeb
 * <p>
 * <p>
 * ��ʾservlet����������
 *
 * @author : ��С��
 * @date : 2022-01-21 02:19
 **/
public class Demo02Servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("���ڳ�ʼ��");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("���ڷ���");
    }

    @Override
    public void destroy() {
        System.out.println("��������");
    }
}
