package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private Integer quantidade;

    public void setNome(String itemNome){
        this.nome=itemNome;

    }

    public void setQuantidade(Integer itemQuantidade){
        this.quantidade=itemQuantidade;

    }

    public String getNome(){
        return nome;
    }

    public Integer getQuantidade(){
        return quantidade;
    }



}
