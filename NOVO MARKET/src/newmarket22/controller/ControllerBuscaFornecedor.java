
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newmarket22.view.NewBuscaFornecedor;

/**
 *
 * @author aluno
 */
public class ControllerBuscaFornecedor implements ActionListener{
       
    NewBuscaFornecedor newBuscaFornecedor;
    
    public ControllerBuscaFornecedor(NewBuscaFornecedor newBuscaFornecedor){
        this.newBuscaFornecedor = newBuscaFornecedor;
        
        this.newBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.newBuscaFornecedor.getjButtonSair().addActionListener(this);
    }
    
    
    public void actioPerfomed(ActionEvent acao){
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == this.newBuscaFornecedor.getjButtonCarregar()){
            
        }else if(acao.getSource() == this.newBuscaFornecedor.getjButtonSair()){
            
        }
    }
            
    
}
