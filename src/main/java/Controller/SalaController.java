/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.SalaHelper;
import Model.DAO.SalaDAO;
import Model.SalaModel;
import View.Sala;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class SalaController {

    private final Sala view;
    private final SalaHelper helper;

    public SalaController(Sala view) {
        this.view = view;
        this.helper = new SalaHelper(view);
            }

    
    
    public void atualizarTabela(){
        
        //buscar lista com pessoas no BD
        SalaDAO salaDAO = new SalaDAO();
        ArrayList<SalaModel> salas = salaDAO.selectAll();
        
        // exibir lista na view
        helper.preencherTabela(salas);
        
    }
    
    public void salvarSala(){
        
        //buscar objeto Espaco da tela
        SalaModel sala = helper.obterModelo();
        //salvar objeto no bando de dados
        new SalaDAO().insert(sala);
        //inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
    }
    
}
    
    