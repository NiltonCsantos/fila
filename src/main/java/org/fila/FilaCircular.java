package org.fila;

public class FilaCircular <T> implements IFila<T>{

    No<T> primeiro;

    No<T> ultimo;

    int tamanho;

    int count;


    @Override
    public String toString()  {
        String filaAuxiliar="";

        No<T> aux= this.primeiro;

        for (int i = 0; i < this.count; i++) {

            filaAuxiliar+=aux.dado+" ";

            aux=aux.prox;

        }

        return  filaAuxiliar;
    }

    public FilaCircular(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void enfileirar(T valor) throws FilaCheiaException {

        if (this.count==this.tamanho){
            throw  new FilaCheiaException("Fila cheia");
        }

        No<T> novoValor= new No<>(valor);

        if (this.primeiro==null){

            this.primeiro=novoValor;
            this.ultimo=novoValor;
            novoValor.prox=this.primeiro;

        }else{
            this.ultimo.prox=novoValor;
            this.ultimo=novoValor;
            ultimo.prox=this.primeiro;
        }
        this.count++;
    }

    @Override
    public T desenfileirar() throws FilaVaziaException {

        if (estaVazia()){
            throw new FilaVaziaException("Fila Vazia");
        }

        T dado= this.primeiro.dado;


        if(this.count!=1){
            this.primeiro=this.primeiro.prox;

            this.ultimo.prox=this.primeiro;
        }else{
            this.primeiro=null;
            this.ultimo=null;
        }

        this.count--;

        return  dado;

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


        if (this.count==0){
            return true;
        }else{
            return  false;
        }


    }

    @Override
    public void limpar() {

        this.primeiro=null;
        this.ultimo=null;

        this.count=0;


    }
}
