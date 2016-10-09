/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorymanagement;
import java.util.*;

/**
 *
 * @author adrianjohnston
 */
public class InventoryManagement {
    private TreeMap<Integer, String> inventory;
    public InventoryManagement()
    {
        inventory=new TreeMap();
  
    }
    public int getCurrentItemStock()//finish methof
    {
        int stock=0;
        Set<Integer>finder=inventory.keySet();
        for(int find:finder)
        {
            
        }
   
       return 0;//return correct information
    }
    public int getTotalInventory()
    {
        return inventory.size();    
    }
    public void setStock(Order orderId,String name)
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
