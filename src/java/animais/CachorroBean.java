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
public class CachorroBean {

    private String nome;
    private String raca;
    private int idade;
    private List<CachorroBean> cachorro = new ArrayList<>();

    public CachorroBean() {
    }

    public CachorroBean(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void addCachorro() {
        CachorroBean novo = new CachorroBean(this.nome, this.raca, this.idade);
        cachorro.add(novo);
        nome = "";
        raca = "";
        idade = 0;
    }

    public void remover(CachorroBean c) {
        cachorro.remove(c);
    }

    public void editar(CachorroBean c) {
        nome = c.getNome();
        raca = c.getRaca();
        idade = c.getIdade();
        cachorro.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<CachorroBean> getCachorro() {
        return cachorro;
    }

    public void setCachorro(List<CachorroBean> cachorro) {
        this.cachorro = cachorro;
    }
}
