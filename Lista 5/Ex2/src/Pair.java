package Ex2.src;

/**
 * Pair<E extends Comparable<? superE>>
 * Pair será do tipo E que está herdando
 * a interface de Comparable implementada
 * na classe do tipo E.
 * Se E = String, quando chamar compareTo(string)
 * ele será o compareTo() default de String.
 * E o mesmo vale para Integer, Double,...
 */

public class Pair<E extends Comparable<E>>{
    private E primeiro, segundo;

    public Pair(E primeiro, E segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public E getPrimeiro() {
        return primeiro;
    }

    public E getSegundo() {
        return segundo;
    }

    public E getMax() {
        return primeiro.compareTo(segundo) > 0 ? primeiro : segundo;
    }

    public E getMin() {
        return primeiro.compareTo(segundo) > 0 ? segundo : primeiro;
    }
}
