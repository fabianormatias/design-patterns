package composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements IComposite {

    private String descricao;
    private int codigo;

    private List<IComposite> setores = new ArrayList();

    public Departamento(){}

    public Departamento(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public void add(IComposite composite) {
        setores.add(composite);
    }

    public void remove(IComposite composite) {
        setores.remove(composite);
    }

    public IComposite getChild(int i) {
        return setores.get(i);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
