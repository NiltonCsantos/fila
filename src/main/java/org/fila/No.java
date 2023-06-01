package org.fila;

public class No <T>{

    T dado;

    No<T> prox;

    public No(T novoDado) {
        this.dado = novoDado;
    }
}
