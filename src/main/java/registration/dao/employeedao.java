package registration.dao;
import registration.model.*;
import java.sql.*;
public class employeedao {

	//public static void main(String args[]) throws ClassNotFoundException, SQLException
	public int registeremployee(employee emp)throws ClassNotFoundException, SQLException
	{
		//employee emp = new employee();
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
				
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			Connection con = DriverManager.getConnection(url, "system", "oracledisha");
			System.out.println(" connection success");
			String query = "insert into Registrationform values(register_id.nextval,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			
			//st.setInt(1, 1);
			st.setString(1, emp.getFirstname());
			st.setString(2, emp.getLastname());
			st.setString(3, emp.getUsername());
			st.setString(4, emp.getPassword());
			st.setString(5, emp.getAddress());
			st.setString(6, emp.getContact());

			System.out.println("the statement is "+st);
			int count = st.executeUpdate();
			
			System.out.println(count);
			return count;
		
//		catch(ClassNotFoundException e){
//			System.out.println("driver not loaded");
//		} 
//		catch (SQLException e) {
//			System.out.print("connection failed");
//		}
	}
}
