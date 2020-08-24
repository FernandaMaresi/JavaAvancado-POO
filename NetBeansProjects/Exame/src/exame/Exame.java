/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exame;

/**
 *
 * @author ferfe
 */
public class Exame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Variaveis a = new Variaveis();
      Variaveis b = new Variaveis();
      a.y = 5;
      b.y = 6;
      a.x = 1;
      b.x = 2;
      System.out.println(a.y);
      System.out.println(b.y);
      System.out.println(a.x);
      //erro//System.out.println(b.x);v
      final int i = 1; 
      //erro//System.out.print (i++);
    }
    
}
