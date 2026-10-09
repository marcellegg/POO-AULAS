package exercicio2;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int potenciaMotor;
    protected double capacidadeCarga;

    public Veiculo(String marca, String modelo, int ano,
                    int potenciaMotor, double capacidadeCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potenciaMotor = potenciaMotor;
        this.capacidadeCarga = capacidadeCarga;
    }

    public abstract void imprime();
}