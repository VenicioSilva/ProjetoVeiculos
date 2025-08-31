package model;

public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro [Velocidade: 0 km/h -> 20 km/h]");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Carro ---");
        super.exibirDados();
        System.out.println("Portas: " + this.numeroDePortas);
    }
}