package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/formEditarEmpresa")
public class FormEditarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 9040296138138099530L;

	@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idEmpresa = request.getParameter("id");
        System.out.println("id ======= " + idEmpresa);
        Empresa empresa = Banco.getEmpresa(idEmpresa);
        
        RequestDispatcher rd = request.getRequestDispatcher("/editaEmpresa.jsp");
        request.setAttribute("id", idEmpresa);
        request.setAttribute("empresa", empresa.getNome());
        request.setAttribute("data", empresa.getDataAbertura());
        rd.forward(request, response);
    }
    
}