package org.fila;

public class FilaVetor <T> implements IFila<T>{

    T[] dados;
    int tamanho;
    int primeiro;
    int ultimo;
    int quantidade;

    @Override
    public String toString() {

        String string="";

        for (int i = 0; i <this.quantidade; i++) {

            string+=dados[i]+" ";

        }
        return string;
    }

    public FilaVetor(int tamanho) {

        this.tamanho = tamanho;
        this.dados = (T[]) new Object[tamanho];
        this.ultimo=tamanho-1;
        this.primeiro=0;
        this.quantidade=0;

    }

    @Override
    public void enfileirar(T valor) throws FilaCheiaException {

        if (this.quantidade==this.tamanho){

            throw new FilaCheiaException("Fila cheia");

        }

        // tamanho==18;
        // quantidade == 18-1 ==17

        this.ultimo= (ultimo+1)%tamanho;

        dados[ultimo]=valor;

        this.quantidade++;

        //17=(17+1)%18;
        //17=18%18=== 18\18== c1 r0
        //0

        //0=0+1%18
        //0=1%18
        //1





    }

    @Override
    public T desenfileirar() throws FilaVaziaException {

        if (estaVazia()){
            throw new FilaVaziaException("Fila vazia");
        }

        T valor= this.dados[primeiro];
        dados[primeiro]=null;
        primeiro=(primeiro+1)%tamanho;

        this.quantidade--;

        return valor;

        //0= (0+1)%5
    }

    @Override
    public int getQtd() {
        return quantidade;
    }

    @Override
    public int getQtdMaxSuportada() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return this.quantidade==0;
    }

    @Override
    public void limpar() {



    }
}
