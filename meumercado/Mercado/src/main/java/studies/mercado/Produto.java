/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studies.mercado;

/**
 *
 * @author Jhonathan Pablo
 */
public class Produto {
    String nome;
    double precoOriginal;
    
    
    public Produto(String produto, double preco){
        this.nome = produto;
        this.precoOriginal = preco;
 
        System.out.println("Novo Produto " + produto + ", R$" + preco);
        
    }
    public double calcularPrecoComDesconto(double percentualDesconto){
        double precoDesconto;
        
        if((percentualDesconto >= 0.0) && (percentualDesconto <= 1.0)){
            precoDesconto = precoOriginal - (precoOriginal * percentualDesconto);
            
            return precoDesconto;
            
        }
        else{
            System.out.println("Preco original de " + precoOriginal + " sera mantido"); 
            return precoOriginal;
        }
       
    
}
    public void descricao (double precoComDescontoFinal){
        
        System.out.println();
        System.out.println("DADOS DO PRODUTO");
        System.out.println("Nome: " + nome);
        String totalFormatado1 = String.format("R$%.2f", precoOriginal);
        System.out.println("Preco: " + totalFormatado1);
        String totalFormatado2 = String.format("R$%.2f", precoComDescontoFinal);
        System.out.println("Preco com Desconto: " + totalFormatado2);
        String totalFormatado3 = String.format("R$%.2f", (precoOriginal - precoComDescontoFinal));
        System.out.println("O valor de desconto: " + totalFormatado3);
        System.out.println();
       
    }
    
}
