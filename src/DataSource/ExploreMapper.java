/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import Instances.Explore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fairlyn
 */
public class ExploreMapper {

    /*public boolean insertOrders(ArrayList<Order> ol, Connection conn) throws SQLException {
     int rowsInserted = 0;
     String SQLString = "insert into v_orders values (?,?,?,?,?,?)";
     PreparedStatement statement = null;
     statement = conn.prepareStatement(SQLString);

     for (int i = 0; i < ol.size(); i++) {
     Order o = ol.get(i);
     statement.setInt(1, o.getOno());
     statement.setInt(2, o.getCno());
     statement.setInt(3, o.getEno());
     statement.setString(4, o.getReceived());
     statement.setString(5, o.getShipped());
     statement.setInt(6, o.getVer());
     rowsInserted += statement.executeUpdate();
     }
     if (testRun) {
     System.out.println("insertOrders(): " + (rowsInserted == ol.size())); // for test
     }
     return (rowsInserted == ol.size());
     }

     // Update a list of orders 
     // using optimistic offline lock (version no)
     // Returns true if any conflict in version number
     public boolean updateOrders(ArrayList<Order> ol, Connection conn) throws SQLException {
     int rowsUpdated = 0;
     String SQLString = "update v_orders "
     + "set cno = ?, eno = ?, received = ?, shipped = ?, ver = ? "
     + "where ono = ? and ver = ?";
     PreparedStatement statement = null;

     statement = conn.prepareStatement(SQLString);
     for (int i = 0; i < ol.size(); i++) {
     Order o = ol.get(i);
     statement.setInt(1, o.getCno());
     statement.setInt(2, o.getEno());
     statement.setString(3, o.getReceived().substring(0, 10));
     statement.setString(4, o.getShipped().substring(0, 10));
     statement.setInt(5, o.getVer() + 1); // next version number
     statement.setInt(6, o.getOno());
     statement.setInt(7, o.getVer());   // old version number
     int tupleUpdated = statement.executeUpdate();
     if (tupleUpdated == 1) {
     o.incrVer();                       // increment version in current OrderObject
     }
     rowsUpdated += tupleUpdated;
     }
     if (testRun) {
     System.out.println("updateOrders: " + (rowsUpdated == ol.size())); // for test
     }
     return (rowsUpdated == ol.size());    // false if any conflict in version number             
     }

     // Insert a list of new order details
     // Returns true if all elements were inserted successfully
     public boolean insertOrderDetails(ArrayList<OrderDetail> odl, Connection conn) throws SQLException {
     String SQLString = "insert into v_odetails values (?,?,?)";
     PreparedStatement statement = null;

     int rowsInserted = 0;
     if (0 < odl.size()) {
     statement = conn.prepareStatement(SQLString);
     for (int i = 0; i < odl.size(); i++) {
     statement.setInt(1, odl.get(i).getOno());
     statement.setInt(2, odl.get(i).getPno());
     statement.setInt(3, odl.get(i).getQty());
     rowsInserted += statement.executeUpdate();
     }
     }
     if (testRun) {
     System.out.println("insertOrderDetails:" + (rowsInserted == odl.size())); // for test
     }
     return rowsInserted == odl.size();
     }

     //======  Methods to read from DB =======================================================
     // Retrieve a specific order and related order details
     // Returns the Order-object
     */
    public Explore getExplore(int biome, Connection conn) {
        Explore expl = null;
        String SQLString1 = "select * from RPGExplore where biome = ?";
        PreparedStatement statement = null;

        try {
            statement = conn.prepareStatement(SQLString1);
            statement.setInt(1, biome);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                expl = new Explore();
                expl.setExplore(1);
                expl.setNumber(2);
                expl.setType(3);
                expl.setBiome(rs.getInt(4));
                System.out.println("explore created;");
            }
        } catch (Exception e) {
            System.out.println("Fail in ExploreMapper - getExplore");
            System.out.println(e.getMessage());
        }
        return expl;
    }
    /*// Retrieves the next unique order number from DB

     public int getNextOrderNo(Connection conn) {
     int nextOno = 0;
     String SQLString = "select v_orderseq.nextval  " + "from dual";
     PreparedStatement statement = null;
     try {
     statement = conn.prepareStatement(SQLString);
     ResultSet rs = statement.executeQuery();
     if (rs.next()) {
     nextOno = rs.getInt(1);
     }
     } catch (Exception e) {
     System.out.println("Fail in OrderMapper - getNextOrderNo");
     System.out.println(e.getMessage());
     }
     return nextOno;
     }*/
}
