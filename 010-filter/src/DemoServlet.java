import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JavaWeb
 *
 * @author : ÔøÐ¡½Ü
 * @date : 2022-02-04 14:28
 **/
@WebServlet("/do")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dome01 service........ ");
        req.getRequestDispatcher("succ.html").forward(req,resp);
    }
}
