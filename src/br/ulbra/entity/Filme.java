
package br.ulbra.entity;

import java.util.Date;


public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private String lancamento;
    private String tematica;
    private String sinopse;
    private String duracao;
    private String diretor;
    
    public Filme(){
        
    }
    public Filme(int id, String titulo, String genero, String lancamento,
            String tematica, String sinopse, String duracao, String diretor){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
        this.tematica = tematica;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.diretor = diretor;
                
    }
    public String toString(){
        return " ID:      "      + this.id
                + "Titulo: "     + this.titulo
                + "Genero: "     + this.genero
                + "Lançamento: " + this.lancamento
                + "Temática: "   + this.tematica
                + "Sinopse: "    + this.sinopse
                + "Duração: "    + this.duracao
                + "Diretor: "    + this.diretor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
}
