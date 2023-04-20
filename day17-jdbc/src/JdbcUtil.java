import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    /*读取properties配置*/
    private static String url = null;
    private static String username = null;
    private static String pawd = null;
    /*初始化连接池*/
    private static DruidDataSource dataSource = null;
    /*首先加载驱动 加载properties配置*/
    static {
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties p = new Properties();
        try {
            /*load加载流 store写入流*/
            p.load(resourceAsStream);
            /*连接池连接 properties配置*/
            dataSource = new DruidDataSource();
            dataSource.setConnectProperties(p);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*返回连接数据库方法*/
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
//        return DriverManager.getConnection(url,username,pawd);
    }

    /*返回关闭流的方法*/
    /*resultSet statement connection 接口都继承于AutoCloseable的close方法*/
    /*可变参数 加上多态 可以传几个流就关闭几个流*/
    public static void close(AutoCloseable... autoCloseables) throws Exception {
        if (autoCloseables != null) {
            for (AutoCloseable autoCloseable : autoCloseables) {
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
            }
        }
    }
}
