import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 CREATE TABLE `student` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(45) DEFAULT NULL,
 `age` int(11) DEFAULT NULL,
 `sex` char(1) DEFAULT NULL,
 `birth` date DEFAULT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class InsertData {

    public void insertByStatement(String name, int age, String sex, String birth) throws SQLException {
        String sql = "insert into student(name, age, sex, birth) values(\""
                + name + "\", "
                + age + ", \""
                + sex + "\", \""
                + birth + "\")";

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            Statement stmt = conn.createStatement();  // 建立Statement对象

            stmt.executeUpdate(sql);  // 通过Statement对象执行插入数据的SQL语句

            stmt.close();

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        InsertData d = new InsertData();
        d.insertByStatement("kris", 20, "M", "2017-6-1");
        System.out.println("OK");
    }
}