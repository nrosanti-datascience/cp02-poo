package cp02_poo;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com caminhão de placa " + getPlaca());
    }
}
