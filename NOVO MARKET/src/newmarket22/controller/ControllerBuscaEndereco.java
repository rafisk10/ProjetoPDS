
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newmarket22.view.NewBuscaEndereco;

/**
 *
 * @author aluno
 */
public class ControllerBuscaEndereco implements ActionListener{
       
    NewBuscaEndereco newBuscaEndereco;
    
    public ControllerBuscaEndereco(NewBuscaEndereco newBuscaEndereco){
        this.newBuscaEndereco = newBuscaEndereco;
        
        this.newBuscaEndereco.getjButtonCarregar().addActionListener(this);
        this.newBuscaEndereco.getjButtonSair().addActionListener(this);
    }
    
    
    public void actioPerfomed(ActionEvent acao){
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == this.newBuscaEndereco.getjButtonCarregar()){
            
        }else if(acao.getSource() == this.newBuscaEndereco.getjButtonSair()){
            
        }
    }
            
    
}
