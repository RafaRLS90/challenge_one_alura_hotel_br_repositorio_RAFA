package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Reservas;

public class ReservaDAO {

	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvarReserva(Reservas reserva) throws SQLException {
		
	//	public List<Reservas>buscar() {
			List<Reservas> reservas = new ArrayList<Reservas>();
			
		String sql = "SELECT id, dataEntrada, dataSaida, valor, formaPagamento FROM reservas";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				
				pstm.setInt(1, reserva.getDataEntrada());
				pstm.setInt(2, reserva.getDataSaida());
				pstm.setInt(3, reserva.getValor());
				pstm.setString(4, reserva.getFormaPagamento());
				
				pstm.execute();
	
		   }
		}
	}
	
//}
