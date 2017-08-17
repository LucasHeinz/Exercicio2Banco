package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Carro;
import service.CarroService;
import dao.CarroDao;
import jdbc.ConnectionPoolOracle;

public class TesteCarros {

	public static void main(String[] args) throws SQLException {
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			CarroService carroService = new CarroService();
			CarroDao carroDao = new CarroDao(con);
			Carro carro = new Carro("SQL - 1234", "fusca", "Volkswagen", "amarelo");
			carroService.inserir(carro);
			
			List<Carro> carros = carroDao.lista();
			for (Carro car : carros) {
				System.out.println(car.toString());
			}
		}
		try(Connection con = new ConnectionPoolOracle().getConnection()) {
			CarroService carroService = new CarroService();
			carroService.excluir(2);
		}
		
	}
}
