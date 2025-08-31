package model;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto  [Velocidade: 0 km/h -> 30 km/h]");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Moto ---");
        super.exibirDados();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}