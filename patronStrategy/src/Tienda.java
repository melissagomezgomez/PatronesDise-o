// Tienda.java
public class Tienda {
    private StrategyPago strategyPago;

    public void setStrategyPago(StrategyPago strategyPago) {
        this.strategyPago = strategyPago;
    }

    public void realizarCompra(int monto) {
        strategyPago.pagar(monto);
    }
}
