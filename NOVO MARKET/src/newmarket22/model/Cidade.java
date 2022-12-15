
package newmarket22.model;


public class Cidade {
       private int id;
       private String descricao;

    public Cidade() {
    }

    public Cidade(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.getDescricao() + ";" + this.getId() + ";";
    }
       
      
    
}
