package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.KhachHangDao;
import model.ThanhVien;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String action = request.getParameter("action");
		
		if(action==null) {
			System.out.println("khong thuc hien gi het");
		}else if(action.equals("Login")) {
			String userName = request.getParameter("username");
			String passWord = request.getParameter("password");
			if(new KhachHangDao().checkLogin(userName, passWord)) {
				HttpSession session = request.getSession();
				ThanhVien tv = KhachHangDao.mapThanhVien.get(userName);
				session.setAttribute("userlogin", tv);
			}
		}else if(action.equals("Res")) {
			
		}else if(action.equals("Logout")) {
			
		}
		response.sendRedirect("account.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
