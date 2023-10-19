// Paypal.java
public class Paypal implements StrategyPago {
    private String correoElectronico;

    public Paypal(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Pago de " + monto + " USD con Paypal");
        // Lógica real para procesar el pago con Paypal.
    }
}
