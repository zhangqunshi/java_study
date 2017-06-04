import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by kris on 2017/6/4.
 */
public class Clob {

    public void insert() throws SQLException, FileNotFoundException {

        //SQL: alter table test add column content text;

        String sql = "update test set content=? where id=?";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            // 读取文件
            File f = new File("D:\\study\\java_study\\jdbc\\text.txt");
            long fileLength = f.length();
            FileInputStream fis = new FileInputStream(f);

            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setAsciiStream(1, fis, fileLength);  // 设置内容
            pstmt.setInt(2, 1);

            pstmt.execute();

            pstmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        Clob s = new Clob();
        s.insert();
        System.out.println("end");
    }
}
