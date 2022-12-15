/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import newmarket22.model.Classe;
import newmarket22.view.NewViewClasse;

/**
 *
 * @author rafael.silva
 */
public class ControllerClasse implements ActionListener{
    NewViewClasse telaCadClasse;
    
    public ControllerClasse (NewViewClasse parTelaCadBairro){
        
        this.telaCadClasse = parTelaCadBairro;
        
            
            telaCadClasse.getjButtonBuscar().addActionListener(this);
            telaCadClasse.getjButtonCancelar().addActionListener(this);
            telaCadClasse.getjButtonGravar().addActionListener(this);
            telaCadClasse.getjButtonNovo().addActionListener(this);
            telaCadClasse.getjButtonSair().addActionListener(this);
    
            telaCadClasse.ativa(true);
            telaCadClasse.ligaDesliga(false);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaCadClasse.getjButtonNovo()) {
            telaCadClasse.ativa(false);
            telaCadClasse.ligaDesliga(true);
            telaCadClasse.getTxtId().setEnabled(false);
            telaCadClasse.getjTextDescricao().requestFocus();
            
        } else if (e.getSource() == telaCadClasse.getjButtonCancelar()) {
            telaCadClasse.ativa(true);
            telaCadClasse.ligaDesliga(false);
            
        } else if (e.getSource() == telaCadClasse.getjButtonBuscar()) {
        
        } else if (e.getSource() == telaCadClasse.getjButtonGravar()) {
            if (telaCadClasse.getjTextDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Classe classe = new Classe();
                classe.setDescricao(telaCadClasse.getjTextDescricao().getText());
                
                telaCadClasse.ativa(true);
                telaCadClasse.ligaDesliga(true);
            }
        } else if(e.getSource() == telaCadClasse.getjButtonSair()) {
            telaCadClasse.dispose();        
        }
    }
}
