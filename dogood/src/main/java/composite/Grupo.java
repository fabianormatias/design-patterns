package composite;

import java.util.ArrayList;
import java.util.List;

public class Grupo implements IComposite {

    private String descricao;
    private int codigo;

    private List<IComposite> categorias = new ArrayList();

    public Grupo(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Grupo(){}

    public void add(IComposite composite) {
        categorias.add(composite);
    }

    public void remove(IComposite composite) {
        categorias.remove(composite);
    }

    public IComposite getChild(int i) {
        return categorias.get(i);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}