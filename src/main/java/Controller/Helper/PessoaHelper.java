/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.EspacoModel;
import Model.PessoaInscrita;
import Model.SalaModel;
import View.Pessoa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Adauto
 */
public class PessoaHelper implements IHelper {
    
    /**
     * Construtor da classe.
     * Fornece acesso a view para poder trabalhar com os componentes da tela
     */
    private final Pessoa view;
    /**
     * Construtor da classe
     * @param view 
     */
    public PessoaHelper(Pessoa view) {
        this.view = view;
    }

    /**
     * Preenche a tabela com os dados vindos do Banco
     * @param pessoas 
     */
    public void preencherTabela(ArrayList<Model.PessoaInscrita> pessoas) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTablePessoa().getModel();
        tableModel.setNumRows(0);
        
        
        /**
         *  Percorre a lista preenchendo o TableModel
         */
        for (Model.PessoaInscrita pessoa : pessoas) {
            
            tableModel.addRow(new Object[]{
                    
                    pessoa.getId(),
                    pessoa.getNome(),
                    pessoa.getSobrenome(),
                    pessoa.getSalaEtapa1().getNome(),
                    pessoa.getSalaEtapa2().getNome(),
                    pessoa.getEspacoEtapa1().getNome(),
                    pessoa.getEspacoEtapa2().getNome()
            
                    });
            
        }
    }


    /**
     * Métodos para preencher os ComboBox com os dados vindo do Banco
     * @param espacos 
     */
    public void preencherEspacos1(ArrayList<EspacoModel> espacos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxEspaco1().getModel();
        
        for (EspacoModel espaco : espacos) {
            comboBoxModel.addElement(espaco); //aqui está o truque           
        }
        
    }

    /**
     * Métodos para preencher os ComboBox com os dados vindo do Banco
     * @param espacos 
     */
    public void preencherEspacos2(ArrayList<EspacoModel> espacos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxEspaco2().getModel();
        
        for (EspacoModel espaco : espacos) {
            comboBoxModel.addElement(espaco); //aqui está o truque           
        }
    }

    /**
     * Métodos para preencher os ComboBox com os dados vindo do Banco
     * @param salas 
     */
    public void preencherSalas2(ArrayList<SalaModel> salas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxSalaEtapa2().getModel();
        
        for (SalaModel sala : salas) {
            comboBoxModel.addElement(sala); //aqui está o truque 
        }
    }

    /**
     * Métodos para preencher os ComboBox com os dados vindo do Banco
     * @param salas 
     */
    public void preencherSalas1(ArrayList<SalaModel> salas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxSalaEtapa1().getModel();
        
        for (SalaModel sala : salas) {
            comboBoxModel.addElement(sala); //aqui está o truque            
        }
    }
    
    /**
     * Retorna as Salas selecionadas no ComboBox
     * @return 
     */
    public SalaModel obterSala1(){
        return (SalaModel) view.getjComboBoxSalaEtapa1().getSelectedItem();
    }
    
    /**
     * Retorna as Salas selecionadas no ComboBox
     * @return 
     */
    public SalaModel obterSala2(){
        return (SalaModel) view.getjComboBoxSalaEtapa2().getSelectedItem();
    }    

    /**
     * Retorna os Espacos selecionados no ComboBox
     * @return 
     */
    public EspacoModel obterEspaco1(){
        return (EspacoModel) view.getjComboBoxEspaco1().getSelectedItem();
    }    
    
    /**
     * Retorna os Espacos selecionados no ComboBox
     * @return 
     */
    public EspacoModel obterEspaco2(){
        return (EspacoModel) view.getjComboBoxEspaco2().getSelectedItem();
    }    
    
    
    @Override
    public PessoaInscrita obterModelo() {
        String nome = view.getjTextNome().getText();
        String sobrenome = view.getjTextSobrenome().getText();
        SalaModel sala1 = obterSala1();
        SalaModel sala2 = obterSala2();
        EspacoModel espaco1 = obterEspaco1();
        EspacoModel espaco2 = obterEspaco2();
        
        PessoaInscrita pessoaInscrita = new PessoaInscrita(0,nome,sobrenome,sala1,sala2,espaco1,espaco2);
        return pessoaInscrita;
    }

    @Override
    public void limparTela() {
        view.getjTextNome().setText("");
        view.getjTextSobrenome().setText("");
    }
    
    
    
    
}
