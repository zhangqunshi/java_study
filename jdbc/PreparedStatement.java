import java.sql.Connection;
import java.sql.SQLException;

public class PreparedStatement {

    public void insert(String name, int age, String sex, String birth) throws SQLException {
        String sql = "insert into student(name, age, sex, birth) values(?,?,?,?)";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, sex);
            pstmt.setString(4, birth);

            pstmt.executeUpdate();

            pstmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        PreparedStatement s = new PreparedStatement();
        s.insert("kris", 100, "M", "2017-6-2");
        System.out.println("OK");
    }
}