package cp02_poo;

public abstract class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade inválida! Deve ser positiva.");
        }
        this.placa = placa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade inválida! Deve ser positiva.");
        }
        this.capacidade = capacidade;
    }

    public abstract void transportar();
}
