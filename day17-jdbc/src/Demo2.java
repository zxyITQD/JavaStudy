import java.sql.*;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args)  {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            /*连接*/
            connection = JdbcUtil.getConnection();

            /*编写sql语句 查询*/
            String sql = "select cid,cname from category where cid = ?";
            /*创建执行预编译对象*/
            preparedStatement = connection.prepareStatement(sql);
            /*过滤用户输入内容 避免sql注入破坏*/
            String num = "3 or 1=1";
            preparedStatement.setString(1, num);
            resultSet = preparedStatement.executeQuery();
            /*集合容器 存储对象*/
            ArrayList<Category> arrayList = new ArrayList<>();
            while (resultSet.next()) {
                int cid = resultSet.getInt("cid");
                String cname = resultSet.getString("cname");
                /*以对象的形式返回数据*/
                Category c = new Category(cid, cname);
                arrayList.add(c);
            }
            for (Category category : arrayList) {
                if (category != null) {
                    System.out.println(category);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*关闭连接*/
            /*无论是否发生异常都要关闭 使用try catch finally 或者jdk7的try resource*/
            try {
                JdbcUtil.close(resultSet, preparedStatement, connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
