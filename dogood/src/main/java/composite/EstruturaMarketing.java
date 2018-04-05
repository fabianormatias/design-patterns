package composite;

import java.util.ArrayList;
import java.util.List;

public class EstruturaMarketing implements IComposite {

    private String descricao;
    private int codigo;

    private List<IComposite> departamentos = new ArrayList();

    public EstruturaMarketing() {
    }

    public EstruturaMarketing(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public void add(IComposite composite) {
        departamentos.add(composite);
    }

    public void remove(IComposite composite) {
        departamentos.remove(composite);
    }

    public IComposite getChild(int i) {
        return departamentos.get(i);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
