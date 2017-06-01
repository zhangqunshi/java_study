import java.sql.*;  //STEP 1. Import required packages

public class DatabaseConnection {

    private final static String DB_NAME = "mysql"; // you need create a database called test
    private final static String DB_USER = "root";  // 数据库用户名
    private final static String DB_PASSWORD = "123456";  // 数据库密码

    /**
     * Get database connection
     * This example use MySQL database, so you need download mysql first,
     * and download the mysql driver jar file, add it to your classpath.
     * <p>
     * 注意：运行此文件需要mysql的驱动jar，并且把jar配置到classpath中, 在windows系统中
     * classpath的配置如下：set classpath=.;mysql-connector-java-5.0.7-bin.jar
     * 如果DOS下无法运行，请把这段中文注释删除，可能是GBK编码问题。
     */
    public Connection getConnection() {
        Connection conn = null;

        try {
            // STEP 2: Register JDBC driver 注册JDBC驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            // STEP 3: Open a connection 打开一个连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DB_NAME, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void main(String[] args) throws SQLException {
        DatabaseConnection d = new DatabaseConnection();
        Connection conn = d.getConnection();
        System.out.println("Get database connection: " + conn);
        conn.close();
    }
}