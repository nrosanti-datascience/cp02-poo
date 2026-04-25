package cp02_poo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 3);
        Moto moto = new Moto("XY29876", 200.0, true);

        ArrayList<Pacote> pacotes = new ArrayList<>();
        pacotes.add(new Pacote("BR999", 10.5, "Pendente"));
        pacotes.add(new Pacote("SP123", 5.0, "Pendente"));
        pacotes.add(new Pacote("RJ777", 15.0, "Pendente"));

        Rota rotaCaminhao = new Rota(pacotes.get(0), caminhao);
        rotaCaminhao.vai();

        Rota rotaMoto = new Rota(pacotes.get(1), moto);
        rotaMoto.vai();

        System.out.println("\n--- Relatório de Pacotes ---");
        for (Pacote p : pacotes) {
            System.out.println("Pacote " + p.getCodigo() + " - Status: " + p.getStatus());
        }
    }
}
