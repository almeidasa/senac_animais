/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import Util.Formatar;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alexandre
 */
@ManagedBean
@SessionScoped
public class CobraBean {

    private String nome;
    private String dataCaptura;
    private int tamanho;
    private double peso;

    private List<CobraBean> cobra = new ArrayList<>();

    public CobraBean() {
    }

    public CobraBean(String nome, String dataCaptura, int tamanho, double peso) {
        this.nome = nome;
        this.dataCaptura = dataCaptura;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void limparTela() {
        nome = "";
        dataCaptura = "";
        tamanho = 0;
        peso = 0.0;
    }

    public String addCobra() throws ParseException {

        
        CobraBean novo = new CobraBean(this.nome, Formatar.Data(this.dataCaptura, "yyyy-MM-dd", "dd/MM/yyyy"), this.tamanho, this.peso);
        cobra.add(novo);
        limparTela();
        return "visualizarCobra";
    }

    public void remover(CobraBean c) {
        cobra.remove(c);
    }

    public String editar(CobraBean c) throws ParseException {           
        this.nome = c.getNome();
        this.dataCaptura = Formatar.Data(c.dataCaptura, "dd/MM/yyyy", "yyyy-MM-dd");
        this.tamanho = c.tamanho;
        this.peso = c.peso;
        
        cobra.remove(c);
        return "cadastrarCobra";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCaptura() {
        return dataCaptura;
    }

    public void setDataCaptura(String dataCaptura) {
        this.dataCaptura = dataCaptura;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List<CobraBean> getCobra() {
        return cobra;
    }

    public void setCobra(List<CobraBean> cobra) {
        this.cobra = cobra;
    }
}
