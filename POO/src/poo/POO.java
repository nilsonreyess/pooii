
package poo;

import models.DBConnect;
import java.sql.Connection;

public class POO {

    public static void main(String[] args) {
        DBConnect con = new DBConnect();
        
        con.getConnection();
    }
    
}
