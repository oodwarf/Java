package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Message;
import Bean.Smessage;
import DBOper.MessageDBOper;

public class DeleteShouCangJiaServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeleteShouCangJiaServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		int id = Integer.parseInt(request.getParameter("id"));
		MessageDBOper db = new MessageDBOper();
		List<Message> list = db.getListFromDb();

		// 收藏夹的list
		List<Smessage> shoucangjiaList = (List<Smessage>) request.getSession()
				.getAttribute("glist");
		if (shoucangjiaList != null) {
			shoucangjiaList = new ArrayList<Smessage>();
		}

		for (Smessage smessage : shoucangjiaList) {
			boolean isNew = true;
			if (id == smessage.getId()) {
				for (Message message : list) {
					if (id == smessage.getId()) {
						isNew = false;
						int num = smessage.getNum();
						smessage.setNum(num - 1);
						break;// 退出循环
					}
				}

				if (isNew) {
					Smessage n = new Smessage(id, smessage.getName(),
							smessage.getPosition(), 1);
					shoucangjiaList.add(n);
				}

				db.updateMessageNum(id);
			}
		}

		// 将收藏夹list添加到session
		request.getSession().setAttribute("glist", shoucangjiaList);
		// 将剩余岗位数据添加到application中
		response.sendRedirect(request.getContextPath() + "/shoucangjia.jsp");
		System.out.println("gou:" + shoucangjiaList.size());
		for (Smessage smessage : shoucangjiaList) {
			System.out.println(smessage.toString());
		}
		
	}


	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
