package com.example.actualizar_inf;

public class DadosApp {

    private PassoReceita[] receita;
    private int posicao;
    private int total_passos;

    // singleton
    public DadosApp() {
        receita = new PassoReceita[10];
        receita[0] = new PassoReceita("Passo 1", "");
        receita[1] = new PassoReceita("Passo 2", "");
        receita[2] = new PassoReceita("Passo 3", "");
        receita[3] = new PassoReceita("Passo 4", "");
        receita[4] = new PassoReceita("Passo 5", "");

        posicao = 1;
        total_passos = 5;
    }

    public String getTextoPassoReceita() {
        return receita[posicao - 1].getTexto();
    }

    public void avancar() {
        if (posicao < total_passos)
            posicao++;
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public void marcarFeito() {
        receita[posicao - 1].setFeito(true);
    }
}
