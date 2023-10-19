public class Comida {
    private String tipoCarne;

    public Comida(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public void agregarCondimentos(String condimentos) {
        System.out.println("Añadiendo condimentos: " + condimentos);
    }

    public void mostrarReceta() {
        System.out.println("Preparando comida con carne de " + tipoCarne);
    }
}
