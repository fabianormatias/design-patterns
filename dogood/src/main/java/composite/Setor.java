package composite;

import java.util.ArrayList;
import java.util.List;

public class Setor implements IComposite {

    private String descricao;
    private int codigo;

    private List<IComposite> grupos = new ArrayList();

    public Setor(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public void add(IComposite composite) {
        grupos.add(composite);
    }

    public void remove(IComposite composite) {
        grupos.remove(composite);
    }

    public IComposite getChild(int i) {
        return grupos.get(i);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
