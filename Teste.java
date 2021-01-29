/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Teste {
    
    public static void main(String[] args) {
        System.out.println(Humano.getTotal());
        Object morgan = new Humano("Morgan Freeman", 80, 0, "Ator");
        System.out.println(Humano.getTotal());
        System.out.println(morgan.toString());
        Humano edward = new Humano("Morgan Freeman", 80, 0, "Ator");
        System.out.println(Humano.getTotal());
        edward.main();
    }
    
}
