package exercicio2;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[4];

        veiculos[0] = new Utilitarios("Fiat", "Strada", 2023, 85, 650, "Cabine dupla");
        veiculos[1] = new Utilitarios("Toyota", "Hilux", 2024, 204, 1000, "Cabine simples");
        veiculos[2] = new Passageiros("Volkswagen", "Gol", 2022, 82, 400, 5);
        veiculos[3] = new Passageiros("Chevrolet", "Spin", 2023, 111, 500, 7);

        for (int i = 0; i < veiculos.length; i++) {
            System.out.println("=== Veículo " + (i + 1) + " ===");
            veiculos[i].imprime();
            System.out.println();
        }
    }
}