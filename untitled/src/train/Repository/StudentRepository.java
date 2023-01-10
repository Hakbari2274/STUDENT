package train.Repository;
import java.sql.*;

public class StudentRepository {
    static final String DB ="jdbc:oracle:thin:@192.168.100.121:1521/lcdev";
    static final String USER="train";
    static final String PASS="train";
            public Connection Connection(){
                try {
                    return DriverManager.getConnection(DB,USER,PASS);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                return null;
            }
            public void findAll(){
                Statement stmt=null;
                try{
                    stmt.getConnection().createStatement();
                    String sql="Insert into student(ID,FIRSTNAME,LASTNAME,STU_AGE) values(1296,haniyeh,akbari,27)";
                    int i=stmt.executeUpdate(sql);
                    System.out.println(i+"raw is inserted into table");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
}
