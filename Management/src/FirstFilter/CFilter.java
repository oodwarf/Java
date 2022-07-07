package FirstFilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("字符过滤器下班");

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		//字符集处理
		System.out.println("字符集过滤器检查工作");
		arg0.setCharacterEncoding("utf-8");
		arg1.setCharacterEncoding("utf-8");
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("字符过滤器上班");
	}

}
