package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Hospedes;



public class HospedeDAO {

	private Connection connection;

	public HospedeDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvarHospede(Hospedes hospede) throws SQLException {
		String sql = "INSERT INTO HOSPEDE (NOME, SOBRENOME, DATANASCIMENTO, NACIONALIDADE) VALUES(?,?,?,?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				
				pstm.setString(1, hospede.getNome());
				pstm.setString(2, hospede.getSobrenome());
				pstm.setInt(3, hospede.getDataNascimento());
				pstm.setString(4, hospede.getNacionalidade());
				
				pstm.execute();
	
		}
	}
	
}
