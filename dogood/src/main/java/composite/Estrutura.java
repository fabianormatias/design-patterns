package composite;

public class Estrutura {

    private String descricao;
    private int codigo;

    public Estrutura() {}

    public Estrutura(String descricao, int codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getCodigo() {
        return this.codigo;
    }

}
