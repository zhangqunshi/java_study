import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Kris on 2017/6/6.
 */
public class DatabaseMetaDataTest {

    public void test() throws SQLException {

        Connection conn = null;
        try {
            conn = new DatabaseConnection().getConnection();

            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("product name: " + dbmd.getDatabaseProductName());
            System.out.println("product version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("Driver Major Version: " + dbmd.getDriverMajorVersion());
            System.out.println("Driver Minor Version: " + dbmd.getDriverMinorVersion());
            System.out.println("Type Info: " + dbmd.getTypeInfo());
            System.out.println("Catalog: " + dbmd.getCatalogSeparator());
            System.out.println("CatalogTerm: " + dbmd.getCatalogTerm());
            System.out.println("SchemaTerm: " + dbmd.getSchemaTerm());

            ResultSet rs = dbmd.getTables(null,
                    null,
                    null,
                    new String[]{"TABLE"});

            // 获取表
            while (rs.next()) {

                String tableName = rs.getString("TABLE_NAME"); // index is 3
                System.out.println("Table Name: " + tableName);

                // 获取列名称
                ResultSet rs2 = dbmd.getColumns(null,
                        null,
                        tableName,
                        null);
                while (rs2.next()) {
                    String colName = rs2.getString(4);        //列名称
                    System.out.println("Column Name: " + colName);
                }

                rs2.close();
            }

            rs.close();


        } finally {
            if (conn != null)
                conn.close();
        }
    }


    public static void main(String[] args) throws SQLException {
        DatabaseMetaDataTest x = new DatabaseMetaDataTest();
        x.test();
        System.out.println("end");
    }
}
