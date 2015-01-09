/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import Instances.Enemy;
import Instances.Explore;
import Instances.Location;
import java.sql.Connection;

/**
 *
 * @author Fairlyn
 */
public class DBFacade {

    private Connection con;
    private EnemyMapper em;
    private ExploreMapper exm;
    private LocationMapper lm;
    
    //== Singleton start
    private static DBFacade instance;

    private DBFacade() {
        em 	= new EnemyMapper();
        lm      = new LocationMapper();
        con = new DBConnect().getConnection();  // the connection will be released upon program 
        // termination by the garbage collector		  
    }

    public static DBFacade getInstance() {
        if (instance == null) {
            instance = new DBFacade();
        }
        return instance;
    }
    
    public Enemy getEnemy(int ono) {
        return em.getEnemy(con, ono);
    }
    public Explore getExplore(int biome){
        System.out.println("explore");
        return exm.getExplore(biome, con);
    }
    public Location getLocation(int biome){
        System.out.println("location");
        return lm.getLocation(1, con);
    }
}
