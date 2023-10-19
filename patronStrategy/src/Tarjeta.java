// Tarjeta.java
public class Tarjeta implements StrategyPago {
    private String numero;
    private String titular;
    private String fechaVencimiento;

    public Tarjeta(String numero, String titular, String fechaVencimiento) {
        this.numero = numero;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Pago de " + monto + " USD con Tarjeta de Crédito");
        // Lógica real para procesar el pago con tarjeta de crédito.
    }
}
