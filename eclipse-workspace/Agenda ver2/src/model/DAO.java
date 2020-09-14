package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class DAO {
	
	/*** Conexão com o banco de dados ***/
	// parametro de conexão
	// Ajusta fuzo Horario // useTimezone=true&serverTimezone=UTC
	//Connection con = null;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";
	
	//método de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return con;
	}
	/*** CRUD ***/
	/* CRUD - Create */
	public void novoContato(javaBeans contato) {
		//criar a quary(comando sql)
		String create = "insert into contatos (nome,fone,email) values (?,?,?)";
		try {
			//abrir conexao com o banco
			Connection con = conectar();
			//preparar a quary
			PreparedStatement pst = con.prepareStatement(create);
			//substituir os parâmetros(?) pelo conteúdo das variáveis JavaBeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			//executar a quary (comando sql)
			pst.executeUpdate();
			//IMPORTE !!! fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
