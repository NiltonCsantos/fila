package org.fila;


public class FilaSimplesmente<T> implements IFila<T> {

    private No<T> primeiro;

    private No<T> ultimo;

    private int tamanho;

    private int count;

    public FilaSimplesmente(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {

        String filaAuxiliar="";

        No<T> aux=this.primeiro;

        for (int i = 0; i < count; i++) {

            filaAuxiliar+=aux.dado+" ";
            aux=aux.prox;

        }


        return  filaAuxiliar;


    }

    @Override
    public void enfileirar(T valor) throws FilaCheiaException {

        if (this.count==this.tamanho){
            throw new FilaCheiaException("Fila cheia");
        }

        No<T> novoDado= new No<>(valor);

        if (this.primeiro==null){

            this.primeiro=novoDado;
            this.ultimo=this.primeiro;


        }else {

            this.ultimo.prox=novoDado;
            this.ultimo=novoDado;

        }

        this.count++;

    }

    @Override
    public T desenfileirar() throws FilaVaziaException {

        if (estaVazia()){

            throw new FilaVaziaException("Lista vazia");

        }

        T dado=this.primeiro.dado;
        this.primeiro=this.primeiro.prox;

        this.count--;
        // 1, 2, 3, 4

        return dado;

    }

    @Override
    public int getQtd() {

        return this.count;

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
        else {
            return false;
        }
    }

    @Override
    public void limpar() {

        this.primeiro=null;

        this.count=0;


    }
}
