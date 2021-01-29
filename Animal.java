/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Animal {
    
    private final String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        super();
        this.nome = nome;
        this.idade = idade;        
    }
    
    public Animal(String nome) {
        this(nome, -1);
    }
    
    public String getNome() {
        return nome;
    }
    
}
