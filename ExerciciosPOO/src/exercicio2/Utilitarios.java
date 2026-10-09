package exercicio2;

public class Utilitarios extends Veiculo {
    private String tipoCabine;

    public Utilitarios(String marca, String modelo, int ano,
                       int potenciaMotor, double capacidadeCarga,
                       String tipoCabine) {
        super(marca, modelo, ano, potenciaMotor, capacidadeCarga);
        this.tipoCabine = tipoCabine;
    }

    @Override
    public void imprime() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potência do motor: " + potenciaMotor + " cv");
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
        System.out.println("Tipo de cabine: " + tipoCabine);
    }
}