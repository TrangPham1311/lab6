/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class KetNoiCSDL {
Connection cn= null;
public KetNoiCSDL() throws SQLException {
String url="jdbc:mysql://localhost:3306/csdl1";
this.cn=(Connection) DriverManager.getConnection(url,"root","");
 }
public ResultSet LayDL (String tenbang) throws SQLException {
ResultSet kq=null;
Statement st=this.cn.createStatement();
String sql= "select * from taikhoan";
kq=st.executeQuery(sql);
return kq;
}

public static void main(String[] args) throws SQLException
 {
 KetNoiCSDL a= new KetNoiCSDL();
 ResultSet rs=a.LayDL("taikhoan");
 while(rs.next())
 {
 System.out.println(rs.getString(1));
 }
}
}