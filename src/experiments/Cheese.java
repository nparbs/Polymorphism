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
public class Cheese implements Dairy {
    
    //private String experationDate;

    @Override
    public void stock() {
        System.out.println("Cheese Stocked");
    }

    @Override
    public void expired() {
        System.out.println("Cheese expired");

    }
    
}
