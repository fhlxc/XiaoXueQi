package backEnd;

import java.sql.*;

public class ConnectMySQL {
	public Connection conn;
	
	public ConnectMySQL()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://10.132.49.170:3306/taskshuntingsystem?useSSL=false&serverTimezone=GMT"
					, "root", "zxc123__");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet query(String sql){
        try {
            Statement stmt = this.conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
