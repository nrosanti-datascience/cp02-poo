package cp02_poo;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void vai() {
        System.out.println("Levando pacote " + pacote.getCodigo() + " no veículo " + veiculo.getPlaca());
        veiculo.transportar();
        pacote.setStatus("Entregue");
    }
}
