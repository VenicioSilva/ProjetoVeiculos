package model;

public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;


    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2025; // Um valor padrão
    }


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void acelerar();

    public void frear() {
        System.out.println("O veiculo esta reduzindo a velocidade.");
    }

    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}