/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livescoreobserver;

import java.util.Scanner;

/**
 *
 * @author aunchisachanatipakul
 */
public class LiveScoreUsingEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ScoreSource s = new ScoreSource();
       Subscriber s1 = new Subscriber();
       Subscriber s2 = new Subscriber();
       s.Register(s1);
       s.Register(s2);
       Scanner inp = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = inp.nextLine();
       while(!scoreLine.equals("")) {
           s.setScoreLine(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = inp.nextLine();
       }
    }
}
    
