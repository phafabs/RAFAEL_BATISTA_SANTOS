package Empregado;

public class Vendedor extends Empregado {
    
    private float percentualComissao;

    public Vendedor(float percentualComissao, String nome, float salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario(){
        return (this.salario = salario + percentualComissao);
    }

    @Override
    public String toString() {
        return super.toString()+calcularSalario()+percentualComissao;
    }

    public Vendedor() {
    }   
}