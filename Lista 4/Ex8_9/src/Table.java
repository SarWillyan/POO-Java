package Ex8_9.src;

import java.util.ArrayList;

public class Table<K, V> { // Ex8
    private ArrayList<Entry<K, V>> entrada = new ArrayList<>();

    public void add(K key, V value) { // Ex 9
        // Ver se chave já existe, caso exista, substitui o valor
        for (Entry<K, V> entry : entrada) {
            if (entry.getKey() == key) {
                entry.setValue(value);
                return;
            }
        }
        // Adicionar nova chave e valor
        entrada.add(new Entry<K, V>(key, value));
    }

    public void remove(K key) { // Ex 9
        // Proucura a chave, se existir remove
        for (int i = 0; i < entrada.size(); i++) {
            if (entrada.get(i).getKey() == key) {
                entrada.remove(i);
            }
        }
    }

    public V get(K key) { // Ex 9
        for (Entry<K, V> entry : entrada) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }
}
