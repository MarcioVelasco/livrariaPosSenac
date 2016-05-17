package br.senac.rj.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Dao {
	
	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String HOST = "http://localhost:3311/";
	private final String BANCO = "livrariajava";
	private final String PARAM = "?createDatabaseIfNotExist=true";
	private final String USER = "root";
	private final String PASS = "root";
	
	public void abrir() throws Exception {
		Class.forName(DRIVER);
		con = DriverManager.getConnection(HOST+BANCO+PARAM, USER, PASS);
	}
	
	public void fechar() throws Exception {
		con.close();
	}
}
