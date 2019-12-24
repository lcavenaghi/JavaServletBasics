package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/excluirEmpresa")
public class ExcluirEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		Banco.excluirEmpresa(Integer.parseInt(request.getParameter("id")));
		
        List<Empresa> lista = Banco.getEmpresas();               
        request.setAttribute("empresas", lista);

        //redirecionando pelo navegador
        response.sendRedirect("listaEmpresas");
    }
}