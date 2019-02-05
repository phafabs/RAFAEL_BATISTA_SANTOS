package Imoveis;

public class Main {
    public static void main(String[]args){
        ImovelNovo novo = new ImovelNovo();
        ImovelVelho velho = new ImovelVelho();
        System.out.println(novo.getPreco());
        System.out.println(velho.getPreco());
    } 
}