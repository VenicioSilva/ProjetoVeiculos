package app;

import model.*;

public class Garagem {

    public static void main(String[] args) {
        Veiculo meuCarro = new Carro("Fiat", "Uno", 2010, 2);
        Veiculo minhaMoto = new Moto("Honda", "CB 500", 2022, 500);
        Veiculo meuCaminhao = new Caminhao("Volvo", "FH", 2020, 45.0);
        Veiculo minhaBicicleta = new Bicicleta("Caloi", "Cross", 18);

        //criando lista / array
        Veiculo[] meusVeiculos = {meuCarro, minhaMoto, meuCaminhao, minhaBicicleta};

        System.out.println("===== Acelerando todos os veiculos na garagem =====");
        // passando por cada item da lista / acelerar()
        for (Veiculo veiculoDaVez : meusVeiculos) {
            veiculoDaVez.acelerar();
        }
        //Depois passar e exibirDados()
        for (Veiculo veiculoDaVez : meusVeiculos) {
            veiculoDaVez.exibirDados();
        }
    }
}