package Empregado;

public class Main {
    public static void main(String[]args){
        Empregado empregado = new Empregado("Rafa",80000);
        Gerente gerente = new Gerente("marketing","Rafa",10000);
        Vendedor vendedor = new Vendedor(500,"Rafa",30000);
        System.out.println(empregado);
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}