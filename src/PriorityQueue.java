/**
 * @author Jose Abraham Gutierrez C., 19111
 * @date 01/04/2020
 */
public interface PriorityQueue<E extends Comparable<E>> {

    /**
     * Metodo getFirst
     * @return el valor minimo en Priority queue
     */
    public E getFirst();
    // pre: !isEmpty()
    // post: returns the minimum value in priority queue

    /**
     * Metodo Remove
     * @return y remueve el valor minimo de queue
     */
    public E remove();
    // pre: !isEmpty()
    // post: returns and removes minimum value from queue

    /**
     * Metodo add
     * @param value se agrega a Priority queue
     */
    public void add(E value);
    // pre: value is non-null comparable
    // post: value is added to priority queue

    /**
     * Metodo si esta vacio
     * @return si no hay elementos en queue
     */
    public boolean isEmpty();
    // post: returns true iff no elements are in queue

    /**
     * Metodo size
     * @return el numero de elementos en queue
     */
    public int size();
    // post: returns number of elements within queue

    /**
     * Metodo clear
     * elimina los elementos de queue
     */
    public void clear();
    // post: removes all elements from queue
}
