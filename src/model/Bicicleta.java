package model;

public class Bicicleta extends Veiculo {

    private int numeroDeMarchas;

    public Bicicleta(String marca, String modelo, int numeroDeMarchas) {
        super(marca, modelo);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public void acelerar() {
        System.out.println("Bicicleta [Velocidade: 0 km/h -> 8 km/h]");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Bicicleta ---");
        super.exibirDados();
        System.out.println("Numero de Marchas: " + this.numeroDeMarchas);
    }
}