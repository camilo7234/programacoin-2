package com.umanizales.listas_se.listasse.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ListSE {
    private Node head;
    private int size;
    private Object add;

    public void add(Kid kid) {
        if (head == null) {
            head = new Node(kid);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            Node newNode = new Node(kid); // " añadadir niños a la lista
            temp.setNext(newNode);
        }
    }

    public void addFirst(Kid kid) {
        if (head == null) {
            head = new Node(kid);
        } else {
            Node temp = new Node(kid);
            temp.setNext(head); // tomar niño y añadirlo al inicio
            head = temp;
        }
    }

    public void addEnd(Kid kid) {

        if (head == null) {
            head = new Node(kid); //"verificar si la cabeza contiene datos"
        } else {
            Node temp = head; //" crear temporal y que tome la cabeza"
            while (temp.getNext() != null) {
                temp = temp.getNext(); //" temporal tome su siguiente"
            }

            Node newNode = new Node(kid);
            temp.setNext(newNode); //" toma a su siguiente y lo añade al final
            size++;//" para el aumento de la lista
        }
    }

    public void girlFirst() {
        if (head != null) {
            ListSE newList = new ListSE(); // crear lista copia
            Node temp = head;
            while (temp != null) ;
            {
                if (temp.getData().getGender() == 'M') {
                    newList.add(temp.getData()); // crear un bucle para que se recorra dato por dato y asi ir preguntando si es niña o niño
                } else {
                    newList.addFirst(temp.getData()); // si es niña añadir al inicio de  lista copia

                }
                temp = temp.getNext(); // temporal tomar su siguiente
            }
            this.head = newList.head;
        }
        public void notify(int position,kid); // se pone el tipo de dato que entra de la clase niño
        {
            Kid Kid = null;
            if (position == 1) { // se crea un contador que se inicie en uno y se añadada niño al inicio
                addFirst(Kid);
            } else {
                int posTemp = 1;
                Node temp = head; // temporal tome la cabeza
                while (posTemp < (position - 1)) {
                    temp = temp.getNext();
                    posTemp++;
                }
                //Estoy parado uno antes de donde debe quedar
                Node newNode = new Node(Kid);
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                size++;
            }
        }

    }

    public void invert() {
        if (head != null) {
            ListSE listTemp = new ListSE(); // crear lista temporal
            Node temp = head;
            while (temp != null) {
                listTemp.add(temp.getData()); // tomar su siguiente y recorrerlo hasta que se pare en el ultimo dato y enviarlo a la nueva lista
                temp = temp.getNext();
            }
            head = listTemp.getHead();
        }
    }

    public void deletePosition(int position) {
        if (position > 0 && position <= this.size) {
            if (position == 1) {
                this.head = this.head.getNext(); // se toma los datos o atributos de la cabeza
                this.size--; // para el tamaño de la lista
            } else {
                Node temp = head; // temporal toma la cabeza
                int count = 1;// crear un contador para saber su posicion y asi eliminar la posicion que el usuario requiere
                while (temp != null) {
                    if (count == position - 1) {
                        temp.setNext(temp.getNext().getNext());
                        this.size--;
                        break; // parar el bucle
                    }
                    temp = temp.getNext();
                    size++;
                }
            }
        }
    }

    public int count() {
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            int cont = 1; // el contador se inicia en uno
            while (temp.getNext() != null) {
                temp = temp.getNext(); //  temporal toma su siguiente
                cont++;
            }
            return cont; // retornar contador
        }
    }

    public void mixByGender() {
        //Se valida que existan por lo menos dos para mezclar
        if (size > 1) {
            int contM = 1;
            int contF = 2;
            //Creo un ayudante y lo posiciono en la cabeza
            Node temp = head;
            ListSE listCp = new ListSE();
            //Recorre la lista de principio a fin
            while (temp != null) {
                if (temp.getData().getGender() == 'M') {
                    if (contM > listCp.size) {
                        listCp.add(temp.getData());
                    } else {
                        listCp.add.notify();
                    }
                    contM += 2;
                } else {
                    if (contF > listCp.size) {
                        listCp.add(temp.getData());
                    } else {
                        listCp.add.notify();
                    }
                    contF += 2;
                }
                temp = temp.getNext();
            }
            head = listCp.getHead();
        }
    }
// el contador se inicia desde uno para hombres y se suma de 2 en dos cada posicion y el otro contador para las mujeres se inica en 2 y se suma de dos en dos cada posicion que se recorra
    //asi se organizarian segun lo desee el usuario en la lista copia
}











