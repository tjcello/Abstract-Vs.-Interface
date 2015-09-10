/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenbaypackers;

/**
 *
 * @author Thomas
 */
public class run {
    
    public static void main(String[] args) {
        Player jordyNelson = new Player();
        jordyNelson.setReceives(true);
        jordyNelson.setScores(6);
        System.out.println(jordyNelson.getReceives() + " Jordy Nelson did catch the ball and scored " + jordyNelson.getScores() + 
                " points");
        
        
        
    }
}
