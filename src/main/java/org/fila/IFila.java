package org.fila;


public interface IFila<T> {
    public void enfileirar(T valor) throws FilaCheiaException;
    public T desenfileirar() throws FilaVaziaException;
    public int getQtd();
    public int getQtdMaxSuportada();
    public boolean estaVazia();
    public void limpar();
}