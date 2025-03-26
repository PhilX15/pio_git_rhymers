package edu.kis.vh.nursery.list;

/**
 * Klasa IntLinkedList impelementuje listę jednokierunkową, umożliwiającą
 * dodawanie, usuwanie i pobieranie elementów.
 */
public class IntLinkedList {

    private static final int DEFAULT_VALUE = -1;
    private Node last;

    /**
     * Dodaje nowy element na koniec listy.
     * 
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy lista jest pusta.
     *
     * @return true, jeśli lista jest pusta; false w przeciwnym razie
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy lista jest pełna.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość ostatniego elementu bez jego usuwania.
     *
     * @return wartość ostatniego elementu lub DEFAULT_VALUE, jeżeli lista jest
     *         pusta
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca wartość ostatniego elementu listy.
     *
     * @return wartość ostatniego elementu lub DEFAULT_VALUE, jeżeli lista jest
     *         pusta
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Klasa wewnętrzna Node, która reprezentuje węzeł listy.
     */
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Inicjalizuje węzeł z podaną wartością.
         *
         * @param i wartość przechowywana przez węzeł
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Zwraca następny węzeł listy.
         *
         * @return następny węzeł lub null, jeżeli aktualny węzeł to ostatni węzeł
         */
        public Node getNext() {
            return next;
        }

        /**
         * Ustawia następny węzeł listy.
         *
         * @param next następny węzeł
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * Zwraca poprzedni węzeł listy.
         *
         * @return poprzedni węzeł lub null, jeżeli aktualny węzeł to pierwszy węzeł
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Ustawia poprzedni węzeł listy.
         *
         * @param prev poprzedni węzeł
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Zwraca wartość przechowywaną w węźle.
         *
         * @return wartość przechowywana w węźle
         */
        public int getValue() {
            return value;
        }

    }

}
