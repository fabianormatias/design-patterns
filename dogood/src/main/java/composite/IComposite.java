package composite;

public interface IComposite {

    public void add(IComposite composite);
    public void remove(IComposite composite);
    public IComposite getChild(int i);
    public String getDescricao();
    public int getCodigo();

}
