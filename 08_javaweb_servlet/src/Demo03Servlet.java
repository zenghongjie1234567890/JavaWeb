import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * JavaWeb
 * <p>
 * <p>
 * ��ʾSession
 *
 * @author : ��С��
 * @date : 2022-01-21 15:26
 **/
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ��ȡsession,���û�оʹ���һ���µĸ���
        HttpSession session = req.getSession();
        System.out.println("session Id:" + session.getId());

    }
}
