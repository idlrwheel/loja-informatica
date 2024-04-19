
package com.lojaInformatica.projeto_integrador.models;


public class Produto {
    private int codigoSKU;
    private String descricao;
    private String categoria;
    private String marca;
    private int quantidade;
    private double valorUnitario;
    private String dataInclusao;
    private String condicao;
    private int estoque;
    private int lote;
    
    public Produto(){
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
     public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
     public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getCondicao(){
        return condicao;
    }
    public void setCondicao(String condicao){
        this.condicao = condicao;
    }
    public int getCodigo(){
        return codigoSKU;
    }
    public void setCodigo(int codigoSKU){
        this.codigoSKU = codigoSKU;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
        public int getEstoque(){
        return estoque;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
     public int getLote(){
        return lote;
    }
    public void setLote(int lote){
        this.lote = lote;
    }
     public double getValorUnitario(){
        return valorUnitario;
    }
    public void valorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public String dataInclusao(){
        return dataInclusao;
    }
    public void dataInclusao(String dataInclusao){
         this.dataInclusao = dataInclusao;
    }
 }
    
 
