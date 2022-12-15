
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import newmarket22.view.NewBuscaClasse;

/**
 *
 * @author aluno
 */
public class ControllerBuscaClasse implements ActionListener{
       
    NewBuscaClasse newBuscaClasse;
    
    public ControllerBuscaClasse(NewBuscaClasse newBuscaBairro){
        this.newBuscaClasse = newBuscaClasse;
        
        this.newBuscaClasse.getjButtonCarregar().addActionListener(this);
        this.newBuscaClasse.getjButtonSair().addActionListener(this);
    }
    
    
    public void actioPerfomed(ActionEvent acao){
        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if(acao.getSource() == this.newBuscaClasse.getjButtonCarregar()){
            
        }else if(acao.getSource() == this.newBuscaClasse.getjButtonSair()){
            
        }
    }
            
    
}
