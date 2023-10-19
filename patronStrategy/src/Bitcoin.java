// Bitcoin.java
public class Bitcoin implements StrategyPago {
    private String direccionWallet;

    public Bitcoin(String direccionWallet) {
        this.direccionWallet = direccionWallet;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Pago de " + monto + " USD con Bitcoin");
        // Lógica real para procesar el pago con Bitcoin.
    }
}

