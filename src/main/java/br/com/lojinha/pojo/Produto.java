package br.com.lojinha.pojo;

import java.util.ArrayList;
import java.util.List;


import br.com.lojinha.enums.Tamanho;


public class Produto {
    private String nome;
    private String marca;
    private Double valor;
    private Tamanho tamanho;
    private ArrayList<ItemIncluso> itemIncluso;

    public Produto(){
        this.marca="Sony";
        this.tamanho=Tamanho.MEDIO;
    };
    
    public void setNome(String productNome){
        this.nome=productNome;
    }

    public void setValor(Double productValor){
        if(productValor<=0){
            throw new IllegalArgumentException("Values must be more than 0");
        };
        this.valor=productValor;
    }

    


    public void setItemIncluso(ArrayList<ItemIncluso> itemLista){
        itemIncluso.add(itemLista);
    }






    public String getNome(){
        return nome;
    }

    public String getMarca(){
        return marca;
    }

    public Double getValor(){
        return valor;
    }
    
    public Tamanho getTamanho(){
        return tamanho;
    }

    public List<Object> getItemIncluso(){
        return itemIncluso;
    }



}
