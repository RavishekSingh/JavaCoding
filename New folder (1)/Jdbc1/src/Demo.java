import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Roll :");
//		int roll = sc.nextInt();
//
//		System.out.println("Enter name :");
//		String name = sc.next();

//		System.out.println("Enter marks");
//		int marks = sc.nextInt();
//		System.out.println("Enter the grace marks");
//		int gmarks = sc.nextInt();

		System.out.println("Enter the roll number");
		int roll = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/web19sb101db";

		// Connection conn=null;
		try (Connection conn = DriverManager.getConnection(url, "root", "ravishek@0578")) {
			// conn=DriverManager.getConnection(url, "root", "ravishek@0578");

//		Statement st =conn.createStatement();
//		
//	int x=	st.executeUpdate("insert into student values("+roll+",'"+name+"',"+marks+")");
//	
//	if(x>0) {
//		System.out.println("record inserted");
//	
//	}	else
//		System.out.println("not inserted");

			// PreparedStatement ps = conn.prepareStatement("insert into student
			// values(?,?,?)");

			// PreparedStatement ps = conn.prepareStatement("update student set
			// marks=marks+? where marks < 800");

			// PreparedStatement ps = conn.prepareStatement("delete from student where
			// roll=?");

			// ps.setInt(1, roll);
			// ps.setString(2, name);
			// ps.setInt(1, roll);
//			if(x>0) {
//			System.out.println("record inserted");
//		
//		}	else
//			System.out.println("not inserted");
		//	PreparedStatement ps = conn.prepareStatement("select * from student");
//			while (rs.next()) {
//				int r = rs.getInt("roll");
//				String n = rs.getString("name");
//				int m = rs.getInt("marks");
//
//				System.out.println("Roll is :" + r);
//				System.out.println("Name is :" + n);
//				System.out.println("Marks is :" + m);
//				System.out.println("==================================");
//			}
			PreparedStatement ps = conn.prepareStatement("select * from student where roll=?");

			ps.setInt(1, roll);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				int r = rs.getInt("roll");
				String n = rs.getString("name");
				int m = rs.getInt("marks");

				System.out.println("Roll is :" + r);
				System.out.println("Name is :" + n);
				System.out.println("Marks is :" + m);
				System.out.println("==================================");
			}else
				System.out.println("record does not exist");

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
//	finally {
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	}

}
