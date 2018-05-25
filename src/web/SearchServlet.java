package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.SearchBean;
import service.KaiinnService;

/**
 * Servlet implementation class IndexStartServlet
 */
@WebServlet("/StartServlet")
public class SearchServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet()
	{
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("StartServletが実行されました。");
		String inputNumStr = request.getParameter("id");
		int inputNum = Integer.parseInt(inputNumStr);

		KaiinnService kserv = new KaiinnService();

		SearchBean bean = kserv.search(inputNum);


		request.setAttribute("bean", bean);

		RequestDispatcher disp = request.getRequestDispatcher("/search.jsp");
		disp.forward(request, response);

	}

}
