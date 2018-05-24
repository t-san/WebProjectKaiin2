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
	public class SearchServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private static  String SearchSQL="select "
						+ "   EMPLOYEEID"
						+ "  ,EMPLOYEENAME"
						+ " from "
						+ "   EMPLOYEES "
						+ "where "
						+ "  EMPLOYEEID =? ";


//				"select "
//				+ "  CUSTOMERS.PREFECTURALID"
//				+ "  ,PREFECTURALS.PREFECTURALNAME AS 都道府県名"
//				+ "  ,COUNT(*) AS 顧客数"
//				+ " from "
//				+ "  CUSTOMERS "
//				+ "   JOIN"
//				+ " PREFECTURALS"
//				+ " ON CUSTOMERS.PREFECTURALID = PREFECTURALS.PREFECTURALID "
//				+ " GROUP BY"
//				+ " CUSTOMERS.PREFECTURALID"
//				+ " ,PREFECTURALS.PREFECTURALNAME";
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public SearchServlet() {
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
			String inputNumStr=request.getParameter("id");
			int inputNum=Integer.parseInt(inputNumStr);

			KaiinnService kserv=new KaiinnService();

			SearchBean bean =kserv.search(inputNum);




			//com.mysql.jdbc.Driver d= new com.mysql.jdbc.Driver();
			//com.mysql.jdbc.JDBC4Connection c = new com.mysql.jdbc.JDBC4Connection();
			//接続の実行とコネクションオブジェクトの取得


			//今日の日付の文字列をリクエストにセット キー名は「now」とする

			request.setAttribute("bean", bean);
//			System.out.println(returnNum + ":をJSPに渡します。");


			RequestDispatcher disp = request.getRequestDispatcher("/search.jsp");
			disp.forward(request, response);

		}

	}


