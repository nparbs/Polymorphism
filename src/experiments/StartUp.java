/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Nick
 */
public class StartUp {
    
     public static void main(String[] args) {
        Dairy[] dairy = new Dairy[2];
        dairy[0] = new Cheese();
        dairy[1] = new Milk();
        
        for(Dairy d : dairy) {
            d.stock();
            d.expired();
        }
        
        HotPocket cheeseHP = new HotPocket();
        
        cheeseHP.makeHotPockets(2);
    }
}
