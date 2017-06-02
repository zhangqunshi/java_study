import java.sql.Connection;
import java.sql.SQLException;

public class Statement {

    public void createTable() throws SQLException {
        String sql = "create table test(id int primary key, name varchar(45))";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            java.sql.Statement stmt = conn.createStatement();  // 建立Statement对象

            stmt.execute(sql);  // 通过Statement对象执行SQL语句

            stmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        Statement s = new Statement();
        s.createTable();
        System.out.println("OK");
    }
}