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
		
//		String sql = 
		
		
		
		return carros;
	}
	
	
	
}
