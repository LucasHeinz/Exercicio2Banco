package service;

import model.Carro;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CarroDao;
import jdbc.ConnectionPoolOracle;

public class CarroService {

	public void inserir(Carro carro) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CarroDao(con).inserir(carro);
		}
	}
	
	public void excluir(Integer codigo) throws SQLException{
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CarroDao(con).excluir(codigo);
		}
	}
	
}
