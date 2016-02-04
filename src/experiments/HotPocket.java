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
public class HotPocket implements Frozen {

    @Override
    public void stock() {
        
    }

    @Override
    public void tempCheck() {

    }
    public void makeHotPockets(int numOf){
        this.unpackage();
        this.prepFood();
        this.cook(numOf);
        
    }
    
    private void unpackage(){
        System.out.println("Remove Hot Pocket(s) from box");
    }
    private void prepFood() {
        System.out.println("Prep Hot Pocket(s), and Place in oven/microwave");
    }
    private void cook(int numOf){
        System.out.println("Cooking " + numOf + " Hot Pocket(s)");     
    }
}
