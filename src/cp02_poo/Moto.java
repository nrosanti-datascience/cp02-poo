package cp02_poo;

public class Moto extends Veiculo {
    private boolean bau;

    public Moto(String placa, double capacidade, boolean bau) {
        super(placa, capacidade);
        this.bau = bau;
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga com moto de placa " + getPlaca());
    }
}
