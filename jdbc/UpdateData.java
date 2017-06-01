import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

    public void updateByStatement(String name, int age, int id) throws SQLException {
        String sql = "update student set name=\"" + name + "\", age=" + age + " where id=" + id + "";

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
        UpdateData d = new UpdateData();
        d.updateByStatement("kris_zhang", 30, 1);
        System.out.println("OK");
    }
}