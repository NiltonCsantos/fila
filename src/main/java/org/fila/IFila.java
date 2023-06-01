package org.fila;


public interface IFila<T> {
    public void enfileirar(T valor) throws Exception;
    public T desenfileirar() throws Exception;
    public int getQtd();
    public int getQtdMaxSuportada();
    public boolean estaVazia();
    public void limpar();
}
