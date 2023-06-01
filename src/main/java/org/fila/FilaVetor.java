package org.fila;

public class FilaVetor<T> implements IFila<T> {

    T [] vetor;

    @Override
    public void enfileirar(T valor) throws Exception {

    }

    @Override
    public T desenfileirar() throws Exception {
        return null;
    }

    @Override
    public int getQtd() {
        return 0;
    }

    @Override
    public int getQtdMaxSuportada() {
        return 0;
    }

    @Override
    public boolean estaVazia() {
        return false;
    }

    @Override
    public void limpar() {

    }
}
