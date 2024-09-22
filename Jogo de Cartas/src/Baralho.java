import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
        for (String naipe : naipes) {
            for (int valor = 2; valor <= 14; valor++) {
                cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas, new Random());
    }

    public Carta comprarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }
}
