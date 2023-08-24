/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescoreobserver;

/**
 *
 * @author aunchisachanatipakul
 */
public class Subscriber implements ScoreListener{
    
    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("live result: " +evt.getScore());
    }
}
