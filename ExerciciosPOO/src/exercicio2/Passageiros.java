package exercicio2;

public class Passageiros extends Veiculo {
    private int quantidadePassageiros;

    public Passageiros(String marca, String modelo, int ano,
                       int potenciaMotor, double capacidadeCarga,
                       int quantidadePassageiros) {
        super(marca, modelo, ano, potenciaMotor, capacidadeCarga);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potência do motor: " + potenciaMotor + " cv");
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("Quantidade de passageiros: " + quantidadePassageiros);
    }
}