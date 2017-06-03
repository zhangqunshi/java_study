import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通过JavaBean来传递数据
 */
public class JDBCJavaBean {

    public void insert(List userList) {

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            String sql = "insert into test(id, name) values(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            for (int i = 0; i < userList.size(); i++) {
                UserBean user = (UserBean) userList.get(i);

                pstmt.setInt(1, user.getId());
                pstmt.setString(2, user.getName());

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
        JDBCJavaBean s = new JDBCJavaBean();

        List list = new ArrayList();

        UserBean bean = new UserBean();
        bean.setId(1);
        bean.setName("kris");
        list.add(bean);

        UserBean bean2 = new UserBean();
        bean2.setId(2);
        bean2.setName("kris2");
        list.add(bean2);

        s.insert(list);
        System.out.println("end");
    }
}