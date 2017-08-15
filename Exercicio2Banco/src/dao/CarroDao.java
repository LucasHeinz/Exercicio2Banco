package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class CarroDao {

	private final Connection con;

	public CarroDao(Connection con) {
		this.con = con;
	}

	public List<Carro> lista() throws SQLException {
		List<Carro> carros = new ArrayList<Carro>();

		String sql = "SELECT * FROM CARROS";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("codigo");
					String placa = rs.getString("placa");
					String tipo = rs.getString("tipo");
					String marca = rs.getString("marca");
					String cor = rs.getString("cor");

					Carro carro = new Carro(id, placa, tipo, marca, cor);
					carros.add(carro);
				}
			}
		}

		return carros;
	}

	public boolean inserir(String placa, String tipo, String marca, String cor) throws SQLException {
		String sql = "INSERT INTO CARROS (CODIGO, PLACA, TIPO, MARCA, COR) VALUES (SEQ_CARROS.nextval, ?, ?, ?, ?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, placa);
		statement.setString(2, tipo);
		statement.setString(3, marca);
		statement.setString(4, cor);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException{
		String sql = "DELETE CARROS WHERE codigo = ?";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);
		 
		return statement.executeUpdate() > 0;
	}

}
