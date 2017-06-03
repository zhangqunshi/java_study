import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * 批量处理允许将相关的SQL语句分组到批处理中，并通过对数据库的一次调用来提交它们，
 * 一次执行完成与数据库之间的交互。一次向数据库发送多个SQL语句时，可以减少通信开销，从而提高性能。
 */
public class PreparedStatementBatch {

    public void test() {

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            String sql = "insert into test(id, name) values(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            for (int i = 6; i <= 8; i++) {
                pstmt.setInt(1, i);
                pstmt.setString(2, "kris");

                pstmt.addBatch(); // 添加SQL语句到批处理中
            }

            int[] x = pstmt.executeBatch();  //执行所有SQL语句
            System.out.println(Arrays.toString(x));

            pstmt.close();

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
        PreparedStatementBatch s = new PreparedStatementBatch();
        s.test();
        System.out.println("end");
    }
}