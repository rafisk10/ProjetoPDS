/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import newmarket22.model.Cidade;
import newmarket22.view.NewViewCidade;


/**
 *
 * @author rafael.silva | Yago.kirchamnn
 */
public class ControllerCidade implements ActionListener{
    
    NewViewCidade telaCadCidade;
    
    public ControllerCidade (NewViewCidade parTelaCadCidade){
        
        this.telaCadCidade = parTelaCadCidade;
        
            
            telaCadCidade.getjButtonBuscar().addActionListener(this);
            telaCadCidade.getjButtonCancelar().addActionListener(this);
            telaCadCidade.getjButtonGravar().addActionListener(this);
            telaCadCidade.getjButtonNovo().addActionListener(this);
            telaCadCidade.getjButtonSair().addActionListener(this);
    
            telaCadCidade.ativa(true);
            telaCadCidade.ligaDesliga(false);
            
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaCadCidade.getjButtonNovo()) {
            telaCadCidade.ativa(false);
            telaCadCidade.ligaDesliga(true);
            telaCadCidade.getTxtId().setEnabled(false);
            telaCadCidade.getDescricao().requestFocus();
            
        } else if (e.getSource() == telaCadCidade.getjButtonCancelar()) {
            telaCadCidade.ativa(true);
            telaCadCidade.ligaDesliga(false);
            
        } else if (e.getSource() == telaCadCidade.getjButtonBuscar()) {
        
        } else if (e.getSource() == telaCadCidade.getjButtonGravar()) {
            if (telaCadCidade.getDescricao().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Descrição é Obrigatório");
            } else {
                Cidade cidade = new Cidade();
                cidade.setDescricao(telaCadCidade.getDescricao().getText());
                telaCadCidade.ativa(true);
                telaCadCidade.ligaDesliga(true);
            }
        } else if(e.getSource() == telaCadCidade.getjButtonSair()) {
            telaCadCidade.dispose();        
        }
    }
    }
    

