import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JavaWeb
 * <p>
 * <p>
 * 演示session的作用域
 *
 * @author : 曾小杰
 * @date : 2022-01-21 15:53
 **/
@WebServlet("in")
public class Demo04Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getSession().setAttribute("fruit","NiuBi");
        Object zhj = req.getSession().getAttribute("fruit");
        System.out.println(zhj);
        req.getSession().invalidate();

    }
}
