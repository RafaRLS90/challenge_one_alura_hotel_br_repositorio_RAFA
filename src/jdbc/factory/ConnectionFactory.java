package jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
public DataSource dataSource;
	
	public ConnectionFactory() throws SQLException {
		ComboPooledDataSource comboPoolDataSource = new ComboPooledDataSource();
		comboPoolDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimezone=true&serverTimezone=UTC");
		comboPoolDataSource.setUser("root");
		comboPoolDataSource.setPassword("rafadev1990java");
		
		this.dataSource = comboPoolDataSource;
	}
	
	public Connection recuperarConexao() {
	try {	
		return this.dataSource.getConnection();
	} catch (SQLException ex) {
		throw new RuntimeException(ex);	
		}
	}
}
