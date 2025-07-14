/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package studies.mercado;

/**
 *
 * @author Jhonathan Pablo
 */
public class Mercado {

    public static void main(String[] args) {
        // Saudação
        System.out.println();
        System.out.println("Bem-Vindo ao Meu Mercado");
        System.out.println();
        
        // Produtos
        Produto produto1 = new Produto("Cafe", 14.46);
        System.out.println("Esse produto tem 10% de Desconto!");
        System.out.println();
        
        Produto produto2 = new Produto("Arroz", 22.50);
        System.out.println("Esse Produto tem 25% de Desconto!");
        System.out.println();
        
        Produto produto3 = new Produto("Sal", 4.78);
        System.out.println("Esse produto tem 45% de Desconto!");
        System.out.println();
        
        // Calculo desconto
        double precoDesconto = produto1.calcularPrecoComDesconto(0.10);
        double precoDesconto2 = produto2.calcularPrecoComDesconto(0.25);
        double precoDesconto3 = produto3.calcularPrecoComDesconto(0.45);
        
        // Resultado
        System.out.println();
        String totalFormatado = String.format("R$%.2f", precoDesconto);
        System.out.println("Preco do " + produto1.nome + " com 10% de desconto: " + totalFormatado);
        System.out.println();
        
        System.out.println();
        String totalFormatado2 = String.format("R$%.2f", precoDesconto2);
        System.out.println("Preco do " + produto2.nome + " com 25% de desconto: " + totalFormatado2);
        System.out.println();
        
        System.out.println();
        String totalFormatado3 = String.format("R$%.2f", precoDesconto3);
        System.out.println("Preco do " + produto3.nome + " com 25% de desconto: " + totalFormatado3);
        System.out.println();
        
        //Resumo de tudo
        produto1.descricao(precoDesconto);
        produto2.descricao(precoDesconto2);
        produto3.descricao(precoDesconto3);
        
        
        
    }
}
