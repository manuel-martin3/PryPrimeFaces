
package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    
    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public void Conectar() throws Exception{
        
        try {            
            String url = "jdbc:mysql://localhost:3306/mitocode?user=root&password=123";
            Class.forName("com.mysql.jdbc.Driver");        
            cn = DriverManager.getConnection(url);
        
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if(cn.isClosed() == false){
                    cn.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
}
