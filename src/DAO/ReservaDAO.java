package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Reservas;

public class ReservaDAO {

	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvarHospede(Reservas reserva) throws SQLException {
		String sql = "INSERT INTO HOSPEDE (DATAENTRADA, DATASAIDA, VALOR, FORMAPAGAMENTO) VALUES(?,?,?,?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				
				pstm.setInt(1, reserva.getDataEntrada());
				pstm.setInt(2, reserva.getDataSaida());
				pstm.setInt(3, reserva.getValor());
				pstm.setString(4, reserva.getFormaPagamento());
				
				pstm.execute();
	
		}
	}
	
}
