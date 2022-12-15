/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newmarket22.controller;

import newmarket22.model.Bairro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import newmarket22.view.NewViewBairro;


/**
 *
 * @author rafael.silva
 */
public class ControllerBairro implements ActionListener{
    NewViewBairro telaCadBairro;
    
    public ControllerBairro (NewViewBairro parTelaCadBairro){
        
        this.telaCadBairro = parTelaCadBairro;
        
            
            telaCadBairro.getjButtonBuscar().addActionListener(this);
            telaCadBairro.getjButtonCancelar().addActionListener(this);
            telaCadBairro.getjButtonGravar().addActionListener(this);
            telaCadBairro.getjButtonNovo().addActionListener(this);
            telaCadBairro.getjButtonSair().addActionListener(this);
    
            telaCadBairro.ativa(true);
            telaCadBairro.ligaDesliga(false);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaCadBairro.getjButtonNovo()) {
            telaCadBairro.ativa(false);
            telaCadBairro.ligaDesliga(true);
            telaCadBairro.getTxtId().setEnabled(false);
            telaCadBairro.getTxtDescricao().requestFocus();
            
        } else if (e.getSource() == telaCadBairro.getjButtonCancelar()) {
            telaCadBairro.ativa(true);
            telaCadBairro.ligaDesliga(false);
            
        } else if (e.getSource() == telaCadBairro.getjButtonBuscar()) {
        
        } else if (e.getSource() == telaCadBairro.getjButtonGravar()) {
            if (telaCadBairro.getTxtDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Bairro bairro = new Bairro();
                bairro.setDescricao(telaCadBairro.getTxtDescricao().getText());
                telaCadBairro.ativa(true);
                telaCadBairro.ligaDesliga(true);
            }
        } else if(e.getSource() == telaCadBairro.getjButtonSair()) {
            telaCadBairro.dispose();        
        }
    }
}
