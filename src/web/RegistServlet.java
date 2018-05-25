package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RegistBean;
import domain.SexEnum;
import service.KaiinnService;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("RegistServletが実行されました。");
        //formに入力された値を取得
        String inputNumStr = request.getParameter("id");
        String inputNameStr = request.getParameter("name");
        String inputSexStr = request.getParameter("sex");

        int inputNum = Integer.parseInt(inputNumStr);
        byte[] bi = inputNameStr.getBytes("iso-8859-1");
        String name =new String(bi, "UTF-8");
        KaiinnService kserv = new KaiinnService();

        RegistBean bean = kserv.regist(inputNum,name,SexEnum.valueOf(inputSexStr));

        request.setAttribute("bean", bean);

        RequestDispatcher disp = request.getRequestDispatcher("/regist.jsp");
        disp.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
