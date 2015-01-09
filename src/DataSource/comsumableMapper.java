/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import Instances.Consumables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fairlyn
 */
public class comsumableMapper {

    public Consumables getEnemy(int cno, Connection conn) {
        Consumables com = null;
        String SQLString1 = "select * from RPGComsumable where cno = ?";
        PreparedStatement statement = null;

        try {
            statement = conn.prepareStatement(SQLString1);
            statement.setInt(1, cno);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                com = new Consumables();
                com.setName(rs.getString(2));
                com.setDescription(rs.getString(3));
                com.setOnUseDescription(rs.getString(4));
                com.setEffectText(rs.getString(5));
                com.setEffectText(rs.getString(6));
                com.setEffect(rs.getInt(7));
                com.setAmount(rs.getInt(8));
                com.setSellValue(rs.getInt(9));
            }
        } catch (Exception e) {
            System.out.println("Fail in OrderMapper - getOrder");
            System.out.println(e.getMessage());
        }
        return com;
    }
}
