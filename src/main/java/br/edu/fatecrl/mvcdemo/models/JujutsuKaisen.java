package br.edu.fatecrl.mvcdemo.models;

public class JujutsuKaisen {

    private String nome;
    private String cla;
    private int lvlPoder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getLvlPoder() {
        return lvlPoder;
    }

    public void setLvlPoder(int lvlPoder) {
        this.lvlPoder = lvlPoder;
    }

    public JujutsuKaisen(String nome, String cla, int lvlPoder) {
        this.nome = nome;
        this.cla = cla;
        this.lvlPoder = lvlPoder;
    }
}
