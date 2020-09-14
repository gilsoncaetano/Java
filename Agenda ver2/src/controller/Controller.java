package controller;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.javaBeans;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     // Criar objetos para acessar os métodos JavaBeans(Model)
	javaBeans contato = new javaBeans();
	//Criar objeto para acessar os métodos DAO(model)
	DAO dao = new DAO();
	
	
    
    public Controller() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// método principal do Servlet
		// as variáveis abaixo recebem os parâmetros do formulário contato.jsp
		String nome = request.getParameter("nome");
		String fone = request.getParameter("fone");
		String email = request.getParameter("email");
		//Setar as variáveis da classe JavaBeans
		contato.setNome(nome);
		contato.setFone(fone);
		contato.setEmail(email);
		//"Dar a ordem" para o DAO executar o método novoContato()
		dao.novoContato(contato);
		//redirecionar para a página index.jsp
		response.sendRedirect("index.jsp");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
