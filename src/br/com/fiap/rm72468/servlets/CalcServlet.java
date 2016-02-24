package br.com.fiap.rm72468.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.rm72468.bo.Calculadora;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcular")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalcServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Double n1 = Double.parseDouble(request.getParameter("txtNumero1"));
		Double n2 = Double.parseDouble(request.getParameter("txtNumero2"));
		String op = request.getParameter("operacao");

		response.getWriter().println("Os parametros enviados foram n1=" + n1 + ", n2=" + n2 + " e op=" + op);

		Calculadora c = new Calculadora(n1, n2, op);
		try {
			response.getWriter().println("<br>Resultado: " + c.fazCalculo());
		} catch (ArithmeticException e) {
			response.getWriter().println("<br><strong>ERRO:</strong>" + e.getMessage());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
