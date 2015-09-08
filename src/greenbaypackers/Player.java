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
    private String Scores;
    private int Receives;
    private int Runs;
    

    public String getScores() {
        return Scores;
    }

    public void setScores(String Scores) {
        this.Scores = Scores;
        
    }

    public int getReceives() {
        return Receives;
    }

    public void setReceives(int Receives) {
        this.Receives = Receives;
    }

    public int getRuns() {
        return Runs;
    }

    public void setRuns(int Runs) {
        this.Runs = Runs;
    }
    
    
}
