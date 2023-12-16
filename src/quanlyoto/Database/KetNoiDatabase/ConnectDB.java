/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyoto.Database.KetNoiDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectDB {
    
        String user="sa";
        String pass="Nothing123$";
        String server="localhost";
        String db="JAVAOOP";
        SQLServerDataSource ds = new SQLServerDataSource();

    
    

    public Connection Conn() throws SQLException {
        ds.setUser(this.user);
        ds.setPassword(this.pass);
        ds.setDatabaseName(this.db);
        ds.setServerName(this.server);
        ds.setTrustServerCertificate(true);
        
        return ds.getConnection();
    }
    
}
