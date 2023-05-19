package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
	//	public List<Reservas> buscar() {
			List<Reservas> reservas = new ArrayList<Reservas>();
		try {
		String sql = "SELECT id, dataEntrada, dataSaida, valor, formaPagamento FROM reservas";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
				pstm.execute();
				
		//	try (Result rst = pstm.getResultSetType()) {
			//	while(rst.next()) {
			//		Reservas reserva = new 
			//	}
			}
		//   }
		//	return reservas;
		
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	




	//public List<Reservas> buscarId(String id){
	//	public void deletar(Integer id) {
			//public void atualizar(Date dataEntrada, Date dataSaida, String vaor, String formaPagamento, Integer id) {
				
				
		//	private void transformarResultSetEmReserva(List<Reservas> reserva, PreparedStatement pstm) throws SQLException {
			//	try (ResultSet rst = pstm.getResultSet()) {
			//		while (rst.next()) {
					//	Reserva reserva = new Reserva(rst.getInt(1), rst.getInt(2), rst.getInt(3), rst.getInt(4), rst.getInt(5));
					
				//		reservas.add(reserva);
			//		}
			//	}
		//	}	
		//}
//	}
//}
//}
}
