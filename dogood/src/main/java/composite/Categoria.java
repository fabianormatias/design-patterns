package composite;

public class Categoria implements IComposite {

    private String descricao;
    private int codigo;

    public Categoria(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public void add(IComposite composite) {
    }

    public void remove(IComposite composite) {
    }

    public IComposite getChild(int i) {
        return null;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
