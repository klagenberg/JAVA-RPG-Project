/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import Instances.Enemy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Fairlyn
 */
public class EnemyMapper {

    ArrayList<Enemy> arrayEnemy = new ArrayList();
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

    public Enemy getEnemy(Connection conn, int biome) {
        Enemy enemy = null;
        String SQLString1 = "select * from RPGEnemy where biome = ?";
        String SQLString2 = "select * from RPGEnemyAttack where eno = ?";
        PreparedStatement statement = null;

        try {
            statement = conn.prepareStatement(SQLString1);
            int eno = 1;
            statement.setInt(1, biome);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                enemy = new Enemy();
                enemy.setName(rs.getString(1));
                enemy.setDamage(2);
                eno = rs.getInt(2);
                enemy.setHealth(rs.getInt(3));
                enemy.setWinMessage(rs.getString(4));
                enemy.setPlayerIsTrappedmessage(rs.getString(5));
                enemy.setPlayerBreaksFreeMessage(rs.getString(6));
                enemy.setLoseMessage(rs.getString(7));
                enemy.setEnemyApproachesMessage(rs.getString(8));
                enemy.setItem(rs.getInt(9));
                enemy.setXp(rs.getInt(10));



                //=== get enemy attacks
                statement = conn.prepareStatement(SQLString2);
                statement.setInt(1, eno);
                rs = statement.executeQuery();
                while (rs.next()) {
                    enemy.addAttackMessage(rs.getString(3));
                    enemy.setName(rs.getString(1));
                    enemy.setDamage(rs.getInt(4));
                    int trap = rs.getInt(5);
                    if (trap == 1) {
                        enemy.setTrap(true);
                    } else {
                        enemy.setTrap(false);
                    }
                    int poison = rs.getInt(6);
                    if (poison == 1) {
                        enemy.setPoison(true);
                    } else {
                        enemy.setPoison(false);
                    }
                    enemy.addAttack();
                }
                arrayEnemy.add(enemy);
            }

        } catch (Exception e) {
            System.out.println("Fail in OrderMapper - getOrder");
            System.out.println(e.getMessage());
        }
        Random rand = new Random();
        int i = rand.nextInt(arrayEnemy.size());
        return arrayEnemy.get(i);
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
