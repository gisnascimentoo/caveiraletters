/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import br.ufsc.inf.leobr.cliente.Jogada;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author rodolfolottin
 */
public class Carta implements Jogada {

    protected int indice;
    protected String nome;
    protected int valor;
    protected ImageIcon image;
    protected int quantidade;
    
    public Carta (int indice, String nome, int valor, ImageIcon image, int quantidade) {
        this.indice = indice;
        this.nome = nome;
        this.valor = valor;
        this.image = image;
        this.quantidade = quantidade;
    }
    
    public Carta (String nome) {
        this.nome = nome;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
