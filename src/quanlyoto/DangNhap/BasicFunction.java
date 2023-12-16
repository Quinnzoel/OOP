/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyoto.DangNhap;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quanlyoto.Database.KetNoiDatabase.ConnectDB;

/**
 *
 * @author Admin
 */
public class BasicFunction {
    
    public int DangNhap(String username, String password) throws SQLException{
        ConnectDB db = new ConnectDB();
        Connection conn= db.Conn();
        String selectQuery = "Select * from account";
        Statement query = conn.createStatement();
        ResultSet result = query.executeQuery(selectQuery);
        while(result.next())
        {
            String c1 = result.getString("username");
            System.out.println(c1);
            String c2 = result.getString("pass");
            System.out.println(c2);
            String c3 = result.getString("ChucVu");
            System.out.println(c3);
            if(c1.equalsIgnoreCase(username) && c2.equalsIgnoreCase(password))
            {
               if(c3.equalsIgnoreCase("admin")) return 0;
               return 1;
            }
        }
        return 2;
        
    }
    
}
