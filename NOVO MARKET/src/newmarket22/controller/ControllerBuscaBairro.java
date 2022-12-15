
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newmarket22.view.NewBuscaBairro;

/**
 *
 * @author aluno
 */
public class ControllerBuscaBairro implements ActionListener{
       
    NewBuscaBairro newBuscaBairro;
    
    public ControllerBuscaBairro(NewBuscaBairro newBuscaBairro){
        this.newBuscaBairro = newBuscaBairro;
        
        this.newBuscaBairro.getjButtonCarregar().addActionListener(this);
        this.newBuscaBairro.getjButtonSair().addActionListener(this);
    }
    
    
    public void actioPerfomed(ActionEvent acao){
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == this.newBuscaBairro.getjButtonCarregar()){
            
        }else if(acao.getSource() == this.newBuscaBairro.getjButtonSair()){
            
        }
    }
            
    
}
