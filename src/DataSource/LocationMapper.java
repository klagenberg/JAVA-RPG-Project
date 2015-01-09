/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import Instances.Location;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Fairlyn
 */
public class LocationMapper {

    public Location getLocation(int biome, Connection conn) {
        Location loc = new Location();
        String SQLString1 = "select * from RPGLocation where biome = ?";
        PreparedStatement statement = null;
        System.out.println("next!");
        try {
            statement = conn.prepareStatement(SQLString1);
            statement.setInt(1, biome);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                loc = new Location();
                loc.setDescription(rs.getString(2));
                loc.setItemFound(rs.getInt(3));
                System.out.println("Location created;");
            }
        } catch (Exception e) {
            System.out.println("Fail in LocationMapper - getLocation");
            System.out.println(e.getMessage());
        }
        return loc;
    }
}
