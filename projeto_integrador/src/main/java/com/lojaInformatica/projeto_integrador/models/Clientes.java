
package com.lojaInformatica.projeto_integrador.models;


public class Clientes {
     private String nome;
     private String sobrenome;
     private String email;
     private int cep;
     private int cpf;
     private int telefone;
     private double dataNascimento;
     
     
    public Clientes (){
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public int getCep(){
        return cep;
    }
    
    public void setCep(int cep){
        this.cep = cep;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void setCPF(int cpf){
        this.cpf = cpf;
    }
    
     public int getTelefone(){
        return telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
     public double getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
        
}
