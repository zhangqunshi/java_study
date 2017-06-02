import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

    public void test() {


        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            conn.setAutoCommit(false);  // 关闭自动提交

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("insert into test(id, name) values(3, 'kris1')");
            stmt.executeUpdate("insert into test(id, name) values(3, 'kris2')");

            stmt.close();

            conn.commit();   // 提交事务

        } catch (SQLException e) {
            System.out.println("Run sql error: " + e.getMessage());
            try {
                conn.rollback();  // 出错回滚
            } catch (SQLException e1) {
                System.out.println("Rollback error: " + e.getMessage());
            }

        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Close connection error: " + e.getMessage());
                }
        }
    }

    public static void main(String[] args) throws SQLException {
        Transaction s = new Transaction();
        s.test();
        System.out.println("end");
    }
}