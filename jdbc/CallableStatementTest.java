import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 DROP PROCEDURE IF EXISTS `proc_adder`;
 DELIMITER ;;
 CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_adder`(IN a int, IN b int, OUT sum int)
 BEGIN
 #Routine body goes here...

 DECLARE c int;
 if a is null then set a = 0;
 end if;

 if b is null then set b = 0;
 end if;

 set sum  = a + b;
 END
 ;;
 DELIMITER ;
 */
public class CallableStatementTest {

    public int test() throws SQLException {
        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            String sql = "{call proc_adder(?, ?, ?)}";
            CallableStatement cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, 10);
            cstmt.setInt(2, 20);
            cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
            cstmt.execute();

            int sum = cstmt.getInt(3);

            return sum;

        } finally {
            if (conn != null)
                conn.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        CallableStatementTest s = new CallableStatementTest();
        int r = s.test();
        System.out.println("result: " + r);
    }
}