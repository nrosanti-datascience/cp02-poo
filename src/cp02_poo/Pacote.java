package cp02_poo;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido! Deve ser positivo.");
        }
        this.codigo = codigo;
        this.peso = peso;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
