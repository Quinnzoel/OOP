/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyoto.Database.Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import quanlyoto.Database.KetNoiDatabase.ConnectDB;

/**
 *
 * @author Admin
 */
public class Select {
    
    public String[] SelectQuery(String col, String dbname) throws SQLException {
        ConnectDB db = new ConnectDB();
        Connection conn= db.Conn();
        String selectQuery = "Select " + col +" from " + dbname;
        Statement query = conn.createStatement();
        ResultSet result = query.executeQuery(selectQuery);
        String c1[] = new String[100];
        int i=0;
        while (result.next())
        {
            c1[i] = result.getString(col);
            i++;
        }
        query.close();
        result.close();
        conn.close();
        return c1;
    }
    
}
