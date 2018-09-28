/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

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
public class IguanaBean {

    private String nome;
    private int idade;
    private List<IguanaBean> iguana = new ArrayList<>();

    public IguanaBean() {
    }

    public IguanaBean(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void limparTela() {
        nome = "";
        idade = 0;
    }

    public String addIguana() {
        IguanaBean novo = new IguanaBean(this.nome, this.idade);
        iguana.add(novo);
        limparTela();
        return "visualizarIguana";
    }

    public void remover(IguanaBean c) {
        iguana.remove(c);
    }

    public String editar(IguanaBean c) {
        nome = c.getNome();
        idade = c.getIdade();
        iguana.remove(c);
        return "cadastrarIguana";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<IguanaBean> getIguana() {
        return iguana;
    }

    public void setIguana(List<IguanaBean> iguana) {
        this.iguana = iguana;
    }
}
