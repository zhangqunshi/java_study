import java.sql.*;
import java.sql.Statement;

public class Transaction {

    public void test() {


        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();

            stmt.executeUpdate("insert into test(id, name) values(4, 'zhang')");

            // 设置存储点
            Savepoint sp1 = conn.setSavepoint("sp1");

            stmt.executeUpdate("insert into test(id, name) values(5, 'kris')");

            ResultSet rs = stmt.executeQuery("select count(*) from student where name='kris'");
            if (rs.next()) {
                int count = rs.getInt(1);

                if (count <= 0) {

                    // if cannot find kris, then rollback insert sql of kris
                    conn.rollback(sp1);  // 回滚到存储点sp1
                }
            }

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