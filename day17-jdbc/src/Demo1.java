import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*加载驱动*/
        Class.forName("com.mysql.jdbc.Driver");
        /*创建连接*/
        String url = "jdbc:mysql://11.237.80.62:3306/test?useSSL=false&characterEncoding=utf-8";
        String username = "root";
        String pawd = "hainiu";
        Connection connection = DriverManager.getConnection(url, username, pawd);
        /*创建执行sql语句*/
        Statement statement = connection.createStatement();
        /*编写sql语句 更新*/
        String sql = "insert into category values(6,'精美手办/胡桃')";
        /*执行sql语句*/
        int i = statement.executeUpdate(sql);
        System.out.println("受影响的有"+i+"条");
        /*关闭连接*/
        connection.close();
    }
}
