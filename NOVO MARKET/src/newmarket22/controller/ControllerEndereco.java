/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import newmarket22.model.Bairro;
import newmarket22.model.Cidade;
import newmarket22.model.Endereco;
import newmarket22.view.NewViewEndereco;

/**
 *
 * @author rafael.silva
 */
public class ControllerEndereco implements ActionListener{
    NewViewEndereco telaCadEndereco;
    
    public ControllerEndereco (NewViewEndereco parTelaCadEndereco){
        
        this.telaCadEndereco = parTelaCadEndereco;
        
            
            telaCadEndereco.getjButtonBuscar().addActionListener(this);
            telaCadEndereco.getjButtonCancelar().addActionListener(this);
            telaCadEndereco.getjButtonGravar().addActionListener(this);
            telaCadEndereco.getjButtonNovo().addActionListener(this);
            telaCadEndereco.getjButtonSair().addActionListener(this);
    
            telaCadEndereco.ativa(true);
            telaCadEndereco.ligaDesliga(false);
            
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaCadEndereco.getjButtonNovo()) {
            telaCadEndereco.ativa(false);
            telaCadEndereco.ligaDesliga(true);
            telaCadEndereco.getjTextFieldLogradouro().requestFocus();
            
        } else if (e.getSource() == telaCadEndereco.getjButtonCancelar()) {
            telaCadEndereco.ativa(true);
            telaCadEndereco.ligaDesliga(false);
            
        } else if (e.getSource() == telaCadEndereco.getjButtonBuscar()) {
        
        } else if (e.getSource() == telaCadEndereco.getjButtonGravar()) {
            if (telaCadEndereco.getjTextFieldCidade().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo Cidade é Obrigatório");
            }else if(telaCadEndereco.getjTextFieldBairro().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Bairro é Obrigatório");
            }else if(telaCadEndereco.getjTextFieldLogradouro().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Logradouro é Obrigatório");
            }else if(telaCadEndereco.getjTextFieldCep().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Cep é Obrigatório");
            }else {
                Endereco endereco = new Endereco();
                Cidade cidade = new Cidade(); // sttar valores
                
                Bairro bairro = new Bairro(); // sttar valores
                endereco.setLogradouro(telaCadEndereco.getjTextFieldLogradouro().getText());
     
                telaCadEndereco.ativa(true);
                telaCadEndereco.ligaDesliga(true);
            }
        } else if(e.getSource() == telaCadEndereco.getjButtonSair()) {
            telaCadEndereco.dispose();        
        }
    }
}

