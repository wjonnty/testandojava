package br.com.lojinha;


import java.util.ArrayList;

import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;



public class LojaApp{
    public static void main(String[] args) {
        Produto meuProduto= new Produto();
        ItemIncluso itemIncluso1= new ItemIncluso();
        itemIncluso1.setNome("Joystick");
        itemIncluso1.setQuantidade(2);

        ArrayList<ItemIncluso> itensInclusos= new ArrayList<ItemIncluso>();

        itensInclusos.add(itemIncluso1);
        System.out.println(itensInclusos.get(0));
     
        meuProduto.setNome("Playstation4");
        meuProduto.setValor(0.001);
        meuProduto.setItemIncluso(itensInclusos);
        
        
        System.out.println(meuProduto.getItemIncluso());
    }
}




