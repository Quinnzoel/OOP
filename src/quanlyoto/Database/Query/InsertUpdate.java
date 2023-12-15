/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyoto.Database.Query;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import quanlyoto.Database.KetNoiDatabase.ConnectDB;

/**
 *
 * @author Admin
 */
public class InsertUpdate {
    
    public static void ExecuteStatement(String statement) throws SQLException {
        ConnectDB db = new ConnectDB();
        Connection conn= db.Conn();
//        String insertQuery = "insert account values ('" + user + "','" + password + "','"+ role + "',0)";
        Statement query = conn.createStatement();
        int result = query.executeUpdate(statement);
        System.out.println(result + " row{s) ínserted.");
        query.close();
        conn.close();
    }
    
}
