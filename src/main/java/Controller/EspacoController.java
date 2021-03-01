/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.EspacoHelper;
import Model.DAO.EspacoDAO;
import Model.EspacoModel;
import View.Espaco;
import java.util.ArrayList;

/**
 * Implementa a classe controladora.
 * Tem acesso a view e ao helper
 * Atualiza a tabela e salva novo espaco com a ajuda do helper
 * @author Adauto
 */
public class EspacoController {

    private final Espaco view;
    private final EspacoHelper helper;

    /**
     * Construtor da classe
     * @param view 
     */
    public EspacoController(Espaco view) {
        this.view = view;
        this.helper = new EspacoHelper(view);
    }
    
    /**
     * Atualiza tabela na view
     */
    public void atualizarTabela(){
        
        /**
         * Busca lista com pessoas no BD
         */
        EspacoDAO espacoDAO = new EspacoDAO();
        ArrayList<Model.EspacoModel> espacos = espacoDAO.selectAll();
        
        /**
         * Exibe lista na view
         */
        helper.preencherTabela(espacos);

        
    }
    
    /**
     * Salva no banco
     */
    public void salvarEspaco(){
        /**
         * Buscar objeto Espaco na tela
         */
        EspacoModel espaco = helper.obterModelo();
        /**
         * Salva objeto no banco de dados
         */
        new EspacoDAO().insert(espaco);
        /**
         * Inserir elemento na tabela
         */
        atualizarTabela();
        helper.limparTela();
    }
    
}
