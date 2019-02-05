package Imoveis;

public class ImovelVelho extends Imoveis{
    float descontoPreco = 150;

    public float getDescontoVelho() {
        return descontoPreco;
    }

    public void setDescontoVelho(float descontoVelho) {
        this.descontoPreco = descontoVelho;
    }
    @Override
    public float getPreco(){
        return preco -= descontoPreco;
    }
}