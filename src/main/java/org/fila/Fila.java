package org.fila;

public class Fila <T> implements IFila<T>{

    No<T> primeiro;
    No<T> ultimo;

    int tamanho;


    @Override
    public String toString() {
        String vetor="";
        No<T> aux= this.primeiro;
        for (int i = 0; i <this.tamanho; i++) {
            vetor+=aux.dado+"\t";
            aux=aux.prox;
        }

        return vetor;
    }

    @Override
    public void enfileirar(T valor) throws Exception {

        if (this.tamanho==10){
            throw  new Exception("Lista cheia");
        }

        No<T> novoDado= new No<>(valor);

        if (this.primeiro==null){
            this.primeiro=novoDado;
            this.ultimo=novoDado;
        }else{
            this.ultimo.prox=novoDado;
            this.ultimo=novoDado;
        }

        this.tamanho++;

    }

    @Override
    public T desenfileirar() throws Exception {

        if (this.tamanho==0){
            throw new Exception("fila vazia");
        }

        No<T> aux= this.primeiro;

        this.primeiro=this.primeiro.prox;

        this.tamanho--;

        return aux.dado;

    }

    @Override
    public int getQtd() {

        return this.tamanho-1;

    }

    @Override
    public int getQtdMaxSuportada() {
        return this.tamanho;
    }

    @Override
    public boolean estaVazia() {

        if (this.primeiro==null){
            return true;
        }

        return false;
    }

    @Override
    public void limpar() {

        this.primeiro=null;

        this.tamanho=0;

    }
}
