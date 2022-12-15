
package newmarket22.model;

import java.util.Date;

public class Pagar {
    private int id;
    private Date dtEmissao;
    private Date hrEmissao;
    private int dtVencimento;
    private int vlrPagar;
    private int status;
    
    private Pagamento pagamento;
    
    public Pagar() {
    }

    public Pagar(int id, Date dtEmissao, Date hrEmissao, int dtVencimento, int vlrPagar, int status) {
        this.id = id;
        this.dtEmissao = dtEmissao;
        this.hrEmissao = hrEmissao;
        this.dtVencimento = dtVencimento;
        this.vlrPagar = vlrPagar;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getHrEmissao() {
        return hrEmissao;
    }

    public void setHrEmissao(Date hrEmissao) {
        this.hrEmissao = hrEmissao;
    }

    public int getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(int dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public int getVlrPagar() {
        return vlrPagar;
    }

    public void setVlrPagar(int vlrPagar) {
        this.vlrPagar = vlrPagar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() + ";" +this.getDtEmissao()+ ";" +this.getHrEmissao()+ ";" +this.getDtVencimento()+ ";" +this.getVlrPagar()+ ";" +this.getStatus() + ";" ;
    }
    
    
}
