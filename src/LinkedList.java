public interface LinkedList {

    /***
     * Agrega un elemento al final de la lista.
     * @param object elemento
     * @return
     */
    boolean add(Object object);

    /***
     * Inserta un elemento en una posición siguinete al nodo especificado.
     * @param node nodo
     * @param object elemento
     * @return
     */
    boolean add(LinkedListNode node, Object object);

    /***
     * Agrega todos los elementos al final de la lista.
     * @param objects elementos
     * @return
     */
    boolean addAll(Object objects);

    /***
     * Inserta todos los elementos desde una posición siguinete al nodo especificado.
     * @param node nodo
     * @param objects elementos
     * @return
     */
    boolean addAll(LinkedListNode node, Object objects);

    /***
     * Inserta el elemento especificado al principio de esta lista.
     * @param object elemento
     * @return
     */
    boolean addFirst(Object object);

    /***
     * Inserta el elemento especificado al final de esta lista.
     * @param object elemento
     * @return
     */
    boolean addLast(Object object);

    /***
     * Elimina todos los elementos de esta lista.
     */
    void clear();

    LinkedList clone();

    /***
     * Devuelve verdadero si contiene el elemento.
     * @param object elemento
     * @return
     */
    boolean contains(Object object);

    /***
     * Devuelve verdadero si contiene todos los elementos.
     * @param objects elementos
     * @return
     */
    boolean containsAll(Object objects);

    /***
     * Devuelve el nodo del elemento especificado, o null si no contiene el elemento.
     * @param object elemento
     * @return
     */
    LinkedListNode nodeOf(Object object);

    /***
     * Devuelve verdadero si el objeto especificado es igual a la lista.
     * @param object elemento
     * @return
     */
    boolean isEquals(Object object);

    /***
     * Devuelve verdadero si no contiene elementos.
     * @return
     */
    boolean isEmpty();

    /***
     * Obtener un elemento de la lista(depende del tipo de lista).
     * @return
     */
    Object get();

    /***
     * Obtener un elemento de la posición del nodo especificado.
     * @param node nodo
     * @return
     */
    Object get(LinkedListNode node);

    /***
     * Obtener un elemento de la posición previa al nodo especificado.
     * @param node nodo
     * @return
     */
    Object getPrevious(LinkedListNode node);

    /***
     * Obtener un elemento de la posición siguinete al nodo especificado.
     * @param node nodo
     * @return
     */
    Object getNext(LinkedListNode node);

    /***
     * Obtener el elemento especificado al principio de esta lista.
     * @return
     */
    Object getFirst();

    /***
     * Obtner el elemento especificado al final de esta lista.
     * @return
     */
    Object getLast();

    /***
     * Elimina el nodo en la lista.
     * @param object elemento
     * @return
     */
    boolean remove(Object object);

    /***
     * Elimina el nodo en la lista.
     * @param node nodo
     * @return
     */
    boolean remove(LinkedListNode node);

    /***
     * Elimina de esta lista todos sus elementos que están contenidos en la colección especificada.
     * @param objects elementos
     * @return
     */
    boolean removeAll(Object objects);

    /***
     * Conserva solo los elementos de esta lista que están contenidos en la colección especificada.
     * @param objects elementos
     * @return
     */
    boolean	retainAll(Object objects);

    /***
     * Reemplaza el elemento en la posición del nodo especificado.
     * @param node nodo
     * @param object elemento
     * @return
     */
    boolean set(LinkedListNode node, Object object);

    /***
     * Devuelve el número de elementos de esta lista.
     * @return
     */
    int size();

    /***
     * Devuelve una vista de la parte de esta lista.
     * @param from nodo
     * @param to nodo
     * @return
     */
    LinkedList subList(LinkedListNode from, LinkedListNode to);

    /***
     * Devuelve un array que contiene todos los elementos de esta lista.
     * @return
     */
    Object[] toArray();

    /***
     * Ordenar lista por ?
     * @return
     */
    LinkedList sort();

    /***
     * retorna un string con el contenido del nodo
     * @return
     */
    String toString();

}
