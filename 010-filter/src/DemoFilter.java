import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * JavaWeb
 *
 * @author : ��С��
 * @date : 2022-02-04 14:40
 **/
@WebFilter("/do")
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello AAA");
        // ����,��������service����Ĵ���
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("hello BBB");
    }

    @Override
    public void destroy() {

    }
}
