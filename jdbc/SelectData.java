import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

/**
 * CREATE TABLE `student` (
 * `id` int(11) NOT NULL AUTO_INCREMENT,
 * `name` varchar(45) DEFAULT NULL,
 * `age` int(11) DEFAULT NULL,
 * `sex` char(1) DEFAULT NULL,
 * `birth` date DEFAULT NULL,
 * PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class SelectData {

    public void selectByStatement() throws SQLException {
        String sql = "select * from student";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            Statement stmt = conn.createStatement();  // 建立Statement对象

            ResultSet rs = stmt.executeQuery(sql);  // STEP 4: Execute a query 通过Statement对象执行查询SQL语句

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                Date birth = rs.getDate("birth");

                System.out.println("id=" + id + ",name=" + name + ",sex=" + sex + ",birth=" + birth);
            }

            rs.close();
            stmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }


    /**
     * Get column value by column index.
     *
     * @throws SQLException
     */
    public void selectByStatementWithColumnIndex() throws SQLException {
        String sql = "select id, name, sex, birth from student";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            Statement stmt = conn.createStatement();  // 建立Statement对象

            ResultSet rs = stmt.executeQuery(sql);  // STEP 4: Execute a query 通过Statement对象执行查询SQL语句

            while (rs.next()) {

                int id = rs.getInt(1); // 通过列的索引值来获取这个列的数值
                String name = rs.getString(2);
                String sex = rs.getString(3);
                Date birth = rs.getDate(4);

                System.out.println("id=" + id + ",name=" + name + ",sex=" + sex + ",birth=" + birth);
            }

            rs.close();
            stmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        SelectData d = new SelectData();

        // 使用列名称
        d.selectByStatement();

        System.out.println("-------------------");

        // 使用列的索引
        d.selectByStatementWithColumnIndex();

        System.out.println("OK");
    }
}