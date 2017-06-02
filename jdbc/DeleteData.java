import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

    public void deleteStudent(int id) throws SQLException {
        String sql = "delete from student where id=" + id + "";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            Statement stmt = conn.createStatement();  // 建立Statement对象

            stmt.executeUpdate(sql);  // 通过Statement对象执行SQL语句

            stmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        DeleteData d = new DeleteData();
        d.deleteStudent(1);
        System.out.println("OK");
    }
}