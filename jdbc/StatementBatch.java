import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * 批量处理允许将相关的SQL语句分组到批处理中，并通过对数据库的一次调用来提交它们，
 * 一次执行完成与数据库之间的交互。一次向数据库发送多个SQL语句时，可以减少通信开销，从而提高性能。
 */
public class StatementBatch {

    public void test() {

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Support batch: " + meta.supportsBatchUpdates());

            Statement stmt = conn.createStatement();

            stmt.addBatch("insert into test(id, name) values(6, 'zhang')"); // 添加SQL语句到批处理中
            stmt.addBatch("insert into test(id, name) values(7, 'kris')");
            stmt.addBatch("insert into test(id, name) values(8, 'kris')");

//            stmt.clearBatch();

            int[] x = stmt.executeBatch();  //执行所有SQL语句
            System.out.println(Arrays.toString(x));

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Run sql error: " + e.getMessage());

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
        StatementBatch s = new StatementBatch();
        s.test();
        System.out.println("end");
    }
}