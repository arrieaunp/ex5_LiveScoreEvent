/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreobserver;

import java.util.ArrayList;
/**
 *
 * @author aunchisachanatipakul
 */
public class ScoreSource {
    private String score;
    ArrayList<ScoreListener> listeners;

    public ScoreSource() {
        listeners = new ArrayList<>();
    }
    
    public void Register(ScoreListener s){
        listeners.add(s);
    }
    
    public void unRegister(ScoreListener s){
        listeners.remove(s);
    }
        
    public String getScoreLine(){
        return score;
    }
    
    public void setScoreLine(String score){
        this.score = score;
        fireScoreEvent(new ScoreEvent(this, this.score));
    }
    
    public void fireScoreEvent(ScoreEvent sce){
        listeners.forEach(listener -> {
            listener.scoreChange(sce);
        });
    }
    
}
