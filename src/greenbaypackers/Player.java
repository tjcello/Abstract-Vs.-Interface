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
public class Player extends Packers {
    private int Scores;
    private boolean Receives;
    private int Runs;
    

    public int getScores() {
        return Scores;
    }

    public void setScores(int Scores) {
        this.Scores = Scores;
        
    }

    public boolean getReceives() {
        return Receives;
    }

    public void setReceives(boolean Receives) {
        this.Receives = Receives;
        
        
    }

    public int getRuns() {
        return Runs;
    }

    public void setRuns(int Runs) {
        this.Runs = Runs;
    }
    
    
}
