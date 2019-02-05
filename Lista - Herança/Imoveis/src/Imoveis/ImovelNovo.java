package Imoveis;

public class ImovelNovo extends Imoveis{
    float adcionalPreco = 50;

    public float getAdcionalPreco() {
        return adcionalPreco;
    }

    public void setAdcionalPreco(float adcionalPreco) {
        this.adcionalPreco = adcionalPreco;
    }

    @Override
    public float getPreco(){
        return preco += adcionalPreco;
    }
}
