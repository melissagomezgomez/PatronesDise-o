import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Pago con tarjeta de crédito
        StrategyPago tarjetaPago = new Tarjeta("1234-5678-9876-5432", "Juan Pérez", "12/24");
        tienda.setStrategyPago(tarjetaPago);
        tienda.realizarCompra(100);

        // Pago con Paypal
        StrategyPago paypalPago = new Paypal("juanperez@example.com");
        tienda.setStrategyPago(paypalPago);
        tienda.realizarCompra(50);

        // Pago con Bitcoin
        StrategyPago bitcoinPago = new Bitcoin("1AbCdEfGhIjKlMnOpQrStUvWxYz");
        tienda.setStrategyPago(bitcoinPago);
        tienda.realizarCompra(200);

        // Mostrar las salidas en ventanas de diálogo usando JOptionPane.
        JOptionPane.showMessageDialog(null, "Pago con Tarjeta de Crédito completado.");
        JOptionPane.showMessageDialog(null, "Pago con Paypal completado.");
        JOptionPane.showMessageDialog(null, "Pago con Bitcoin completado.");
    }
}
