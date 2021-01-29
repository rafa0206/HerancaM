/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public abstract class Mamifero extends Animal {
    
    private int litros;
    
    public Mamifero(String nome, int idade, int litros) {
        super(nome, idade);
        this.litros = litros;
    }
    
    public int getLitros() {
        return litros;
    }
    
    @Override
    public String toString() {
        return "Mamifero{" + "litros=" + litros + '}' + " " + super.toString();        
    }
    
    //podemos ter a versao do main onde quisermos e cada classe tem a sua versao
    public static void main(String[] args) {
        Humano h = new Humano("Stan Lee", 98, 0, "Roteirista");
        System.out.println(h.toString());
    }
}
