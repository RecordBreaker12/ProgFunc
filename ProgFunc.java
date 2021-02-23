package progfunc;

import java.util.HashMap;
import java.util.Map;

public class ProgFunc {

   
    public static void main(String[] args) {
        Map<Integer, String>  mapa = new HashMap<>();
        mapa.put(1, "Amanda da Silva");
        mapa.put(2, "Rafael Garbeloti");
        mapa.put(3, "Michael Mamaril");
        mapa.put(4, "Joao da Silva");
        mapa.put(5, "David Leathernof");
        mapa.entrySet()
                .stream()
                .filter(filtro -> filtro.getValue().contains("da Silva"))
                .forEach(filtro -> System.out.println(filtro.getValue()));
    }
    
}
