/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lojaInformatica.projeto_integrador.models;

/**
 *
 * @author giovanna.sramos3
 */
public class Relatorio {
    private int dataInicial;
    private int dataFinal;
    private String descLoja;
    
    public Relatorio(){
    }
    
    public int getDataInicial(){
        return dataInicial;
    }
    
    public void setDataInicial(int dataInicial){
        this.dataInicial = dataInicial;
    }
    
    public int getDataFinal(){
        return dataFinal;
    }
    
    public void setDataFinal(int dataFinal){
        this.dataFinal = dataFinal;
    }
    
    public String getDescLoja(){
        return descLoja;
    }
    
    public void setDescLoja(String descLoja){
        this.descLoja = descLoja;
    }
    
}
