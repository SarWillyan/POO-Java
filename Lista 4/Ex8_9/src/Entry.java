package Ex8_9.src;

public class Entry<K, V> {// Ex8
    private K key; 
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry [key=" + key + ", value=" + value + "]";
    }
}
