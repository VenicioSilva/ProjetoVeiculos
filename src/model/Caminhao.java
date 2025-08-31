package model;

public class Caminhao extends Veiculo {

    private double capacidadeDeCarga; // em toneladas

    public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
        super(marca, modelo, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhao [Velocidade: 0 km/h -> 10 km/h]");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n--- Caminhao ---");
        super.exibirDados();
        System.out.println("Capacidade de Carga: " + this.capacidadeDeCarga + "t");
    }
}