
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newmarket22.view.NewBuscaCidade;

/**
 *
 * @author aluno
 */
public class ControllerBuscaCidade implements ActionListener{
       
    NewBuscaCidade newBuscaCidade;
    
    public ControllerBuscaCidade(NewBuscaCidade newBuscaCidade){
        this.newBuscaCidade = newBuscaCidade;
        
        this.newBuscaCidade.getjButtonCarregar().addActionListener(this);
        this.newBuscaCidade.getjButtonSair().addActionListener(this);
    }
    
    
    public void actioPerfomed(ActionEvent acao){
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == this.newBuscaCidade.getjButtonCarregar()){
            
        }else if(acao.getSource() == this.newBuscaCidade.getjButtonSair()){
            
        }
    }
            
    
}
