package backend;
import java.sql.*;

public class DBHelper1841720149Alief
{
 
private static Connection koneksi;

public static void bukaKoneksiAlief()
{ 
if(koneksi == null)
{
 
try
{
String url = "jdbc:mysql://localhost:8080/dbperpus"; String user = "root";
String password = "";
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi = DriverManager.getConnection(url, user, password);
}
catch (SQLException t)
{
System.out.println("Error koneksi!");
}
}
}

public static int insertQueryGetIdAlief(String query)
{
bukaKoneksiAlief(); 
int num = 0;
int result = -1;

try
{
Statement stmt = koneksi.createStatement();
num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

ResultSet rs = stmt.getGeneratedKeys();

if (rs.next())
{
    result = rs.getInt(1);
}

rs.close();
stmt.close();
}
catch (Exception e)
{
    e.printStackTrace();
    result = -1;
}

return result;
}

public static boolean executeQueryAlief(String query)
{
bukaKoneksiAlief();
boolean result = false;
 

try
{
    Statement stmt = koneksi.createStatement();
    stmt.executeUpdate(query);
    result = true;
    stmt.close();
}
catch (Exception e)
{
e.printStackTrace();
}
return result;
}

public static ResultSet selectQueryAlief(String query)
{
bukaKoneksiAlief(); ResultSet rs = null;

try
{
Statement stmt = koneksi.createStatement(); rs = stmt.executeQuery(query);
}
catch (Exception e)
{
e.printStackTrace();
}

return rs;
}
}