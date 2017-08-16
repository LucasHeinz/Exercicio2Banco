package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Carro;
import dao.CarroDao;
import jdbc.ConnectionPoolOracle;

public class TesteCarros {

	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			CarroDao carroDao = new CarroDao(con);
//			carroDao.inserir("SQL - 1234", "fusca", "Volkswagen", "amarelo");
			
			List<Carro> carros = carroDao.lista();
			for (Carro carro : carros) {
				System.out.println(carro.toString());
			}
		}
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			CarroDao carroDao = new CarroDao(con);
			carroDao.excluir(2);
		}
		
	}
}
