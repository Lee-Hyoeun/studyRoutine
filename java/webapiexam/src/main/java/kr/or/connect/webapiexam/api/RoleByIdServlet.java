package kr.or.connect.webapiexam.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

/**
 * Servlet implementation class RoleByIdServlet
 */
@WebServlet("/role/*")
public class RoleByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleByIdServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");

		String pathInfo = request.getPathInfo(); // /roles/{roleId}
		String[] pathParts = pathInfo.split("/");
		String idStr = pathParts[1];
		int id = Integer.parseInt(idStr);

		RoleDao dao = new RoleDao();

		Role role = dao.getRole(id);

		ObjectMapper objectMapper = new ObjectMapper();
		String json = objectMapper.writeValueAsString(role);

		PrintWriter out = response.getWriter();
		out.println(json);
		out.close();
	
		// 500에러 -> url입력: http://localhost:8080/webapiexam/role/100 (100은 roleId)
	}

}
