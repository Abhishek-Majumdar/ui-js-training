import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class DemoFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = MyConnection.getMyConnection();
		String FIND_DATA = "select * from EMPLOYEE";
		
		try {
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet set = st.executeQuery(FIND_DATA);
			
			DatabaseMetaData metData = con.getMetaData();
			System.out.println(metData.getDatabaseProductName());
			
			ResultSetMetaData resultSetMetaData = set.getMetaData();
			
			System.out.println("Number of column: " + resultSetMetaData.getColumnCount());
			for(int i=1; i<resultSetMetaData.getColumnCount(); i++)
			{
				System.out.println(resultSetMetaData.getColumnLabel(i));
			}
			
//			while(set.next())
//			{
//				int depID = set.getInt(1);
//				String depName = set.getString(2);
////				System.out.println("Department ID: " + depID + " " + "Department Name: " + depName);
//				set.updateInt(6, 15000);
//				set.updateRow();
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
