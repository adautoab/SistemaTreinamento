/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.PessoaHelper;
import Model.DAO.EspacoDAO;
import Model.DAO.PessoaDAO;
import Model.DAO.SalaDAO;
import Model.EspacoModel;
import Model.PessoaInscrita;
import Model.SalaModel;
import View.Pessoa;
import java.util.ArrayList;

/**
 * Implementa a classe controladora.
 * Tem acesso a view e ao helper
 * @author Adauto
 */
public class PessoaController {

    private final Pessoa view;
    private final PessoaHelper helper;

    /**
     * Costrutor da classe
     * @param view 
     */
    public PessoaController(Pessoa view) {
        this.view = view;
        this.helper = new PessoaHelper(view);
    }
 
    /**
     * Atualiza a tabela com os dados do Banco
     */
    public void atualizarTabela(){
        
        
        /**
         * buscar lista com pessoas no BD
         */
        PessoaDAO pessoaDAO = new PessoaDAO();
        ArrayList<Model.PessoaInscrita> pessoas = pessoaDAO.selectAll();
        
        
        /**
         * exibir lista na view
         */
        helper.preencherTabela(pessoas);
        
    }
    
    /**
     * Atualiza sala no combobox
     */
    public void atualizaSala(){
        
        
        /**
         * buscar salas no banco de dados
         */
        SalaDAO salaDAO = new SalaDAO();
        ArrayList<SalaModel> salas = salaDAO.selectAll();
        
        
        /**
         * exibir salas no combobox salas
         */
        helper.preencherSalas1(salas);
        helper.preencherSalas2(salas);
        
    }
    
    /**
     * Atualiza espaco no combobox
     */
    public void atualizaEspaco(){
        
        
        /**
         * buscar espacos no banco de dados
         */
        EspacoDAO espacoDAO = new EspacoDAO();
        ArrayList<EspacoModel> espacos = espacoDAO.selectAll();
        
        /**
         * exibir espacos no combobox espacos
         */
        helper.preencherEspacos1(espacos);
        helper.preencherEspacos2(espacos);
        
         
    }

    /**
     * Salva inscriçao da pessoa no Treinamento/Evento
     */
    public void inscreverPessoa(){
        
        /**
         * Buscar Objeto PessoaInscrita da tela
         */
        PessoaInscrita pessoaInscrita = helper.obterModelo();
        
        /**
         * Salvar objeto no bando de dados
         */
        new PessoaDAO().insert(pessoaInscrita);
        
        /**
         * inserir elemento na tabela
         */
        atualizarTabela();
        helper.limparTela();
    }
    
}
