/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author ferfe
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vetor
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        //erro //Pessoa p = new Pessoa("Jubileu", 22, "M");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        //g[2] = new Gafanhoto("")
        //Visualizacao vis = new Visualizacao(g[0], v[2]);
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);//Jubileu assiste html
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assite php
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
        
        
        /*System.out.println("Video \n ==============================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n GAFANHOTO \n =======================");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        
        
    }
    
}
