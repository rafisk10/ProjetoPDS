/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newmarket22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import newmarket22.model.Cliente;
import newmarket22.view.NewViewClientes;

/**
 *
 * @author rafael.silva
 */
public class ControllerClientes implements ActionListener{
    NewViewClientes telaCadClientes;
    
    public ControllerClientes (NewViewClientes parTelaCadClientes){
        
        this.telaCadClientes = parTelaCadClientes;
        
            
            telaCadClientes.getjButtonBuscar().addActionListener(this);
            telaCadClientes.getjButtonCancelar().addActionListener(this);
            telaCadClientes.getjButtonGravar().addActionListener(this);
            telaCadClientes.getjButtonNovo().addActionListener(this);
            telaCadClientes.getjButtonSair().addActionListener(this);
    
            telaCadClientes.ativa(true);
            telaCadClientes.ligaDesliga(false);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == telaCadClientes.getjButtonNovo()) {
            telaCadClientes.ativa(false);
            telaCadClientes.ligaDesliga(true);
            telaCadClientes.getjTextFieldLogradouro().setEnabled(false);
            telaCadClientes.getjTextFieldCidade().setEnabled(false);
            telaCadClientes.getjTextFieldBairro().setEnabled(false);  
            telaCadClientes.getjTextFieldCpf().requestFocus();
            
        } else if (e.getSource() == telaCadClientes.getjButtonCancelar()) {
            telaCadClientes.ativa(true);
            telaCadClientes.ligaDesliga(false);
            
        } else if (e.getSource() == telaCadClientes.getjButtonBuscar()) {
        
        } else if (e.getSource() == telaCadClientes.getjButtonGravar()) {
            if (telaCadClientes.getjTextFieldCpf().getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Atributo CPF é Obrigatório");
            }else if (telaCadClientes.getjTextFieldNome().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Nome é Obrigatório");
            }else if (telaCadClientes.getjTextFieldCep().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Cep é Obrigatório");
            }else if (telaCadClientes.getjTextFieldEmail().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Email é Obrigatório");
            }else if (telaCadClientes.getjTextFieldCelular().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Celular é Obrigatório");
            }else {
                Cliente cliente = new Cliente();
                cliente.setCpf(telaCadClientes.getjTextFieldCpf().getText());
                telaCadClientes.ativa(true);
                telaCadClientes.ligaDesliga(true);
            }
        } else if(e.getSource() == telaCadClientes.getjButtonSair()) {
            telaCadClientes.dispose();        
        }
    }
}
