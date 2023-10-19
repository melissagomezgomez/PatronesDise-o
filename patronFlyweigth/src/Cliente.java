public class Cliente {
    public static void main(String[] args) {
        ComidaFactory comidaFactory = new ComidaFactory();

        Comida hamburguesa1 = comidaFactory.obtenerComida("Res");
        hamburguesa1.agregarCondimentos("Lechuga, Tomate, Queso");
        hamburguesa1.mostrarReceta();

        Comida hamburguesa2 = comidaFactory.obtenerComida("Pollo");
        hamburguesa2.agregarCondimentos("Cebolla, Salsa BBQ");
        hamburguesa2.mostrarReceta();

        // Hamburguesa1 y Hamburguesa2 son instancias separadas.
    }

}
