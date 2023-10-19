import java.util.HashMap;
import java.util.Map;
public class ComidaFactory {
    private Map<String, Comida> cache = new HashMap<>();

    public Comida obtenerComida(String tipoCarne) {
        if (cache.containsKey(tipoCarne)) {
            return cache.get(tipoCarne);
        } else {
            Comida comida = new Comida(tipoCarne);
            cache.put(tipoCarne, comida);
            return comida;
        }
    }
}
