/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Humano extends Mamifero {
    
    private static int total = 0;
    private String formacao;
    
    public static int getTotal() { return total; }
    
    public String getFormacao() { return formacao; }
    
    public Humano(String nome, int idade, int litros, String formacao) {
        super(nome, idade, litros);
        this.formacao = formacao;
        ++total;        
    }
    
    @Override
    public String toString() {
        return "Humano{" + "formacao=" + formacao + '}' + " " + super.toString();        
    }
    
    public void main() { System.out.println("Também sou main"); }
    
    public static void main(String[] args) {
        Humano h = new Humano("Rafael", 25, 0, "Bodybiulder");
        System.out.println(h.toString());
        
    }
}
