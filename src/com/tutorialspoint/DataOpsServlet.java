/**
 * 
 */
package com.tutorialspoint;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jwawdhanei
 * 
 */
public class DataOpsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("id");
		String p = request.getParameter("name");
		String e = request.getParameter("profession");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servlet", "root", "mukesh");

			PreparedStatement ps = con
					.prepareStatement("insert into USERDETAILS values(?,?,?)");

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("User has been successfully created...");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}

}
