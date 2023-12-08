import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> prodotti = new HashMap<>();
        prodotti.put("ZW", 786);
        prodotti.put("PO", 814);
        prodotti.put("NB", 776);
        prodotti.put("XA", 444);
        System.out.println("HashMap" + prodotti);

        Collection<Integer> valori = prodotti.values();
        System.out.println("lista valori" + valori);
        List<Integer> valoriOrdinati = new ArrayList<>(valori);
        valoriOrdinati.sort(Comparator.naturalOrder());
        System.out.println("lista valori ordinati" + valoriOrdinati);
    }
}
