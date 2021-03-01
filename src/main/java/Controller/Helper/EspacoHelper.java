/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.EspacoModel;
import View.Espaco;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * Implementação do Helper do Controller EspacoController
 * Herda da Interface IHelper forçando a implementação
 * dos métodos ObterModelo() e limparTela()
 * @author Adauto
 */
public class EspacoHelper implements IHelper{

    /**
     * Construtor da classe.
     * Fornece acesso a view para poder trabalhar com os componentes da tela
     */
    private final Espaco view; 
    public EspacoHelper(Espaco view) {
        this.view = view;
    }
    
 
    
    /**
     * Sobrescreve obterModelo() herdado.
     * Instancia um objetos com os dados da tela e retorna o objeto
     * para o Controller
     * @return 
     */ 
    @Override
    public EspacoModel obterModelo() {
        String nome = view.getjTextNome().getText();
        String lotacaoString = view.getjTextLotacao().getText();
        int lotacao = Integer.parseInt(lotacaoString);
        
        EspacoModel espaco = new EspacoModel(0, nome, lotacao);
        return espaco;
    }

    /**
     * Sobrescreve limparTela() herdado.
     * Limpa a tela setando a String dos JTextField para vazio
     */
    @Override
    public void limparTela() {
        view.getjTextNome().setText("");
        view.getjTextLotacao().setText("");
    }

    /**
     * Preenche tabela da View com os dados do Banco
     * @param espacos 
     */
    public void preencherTabela(ArrayList<Model.EspacoModel> espacos) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableEspaco().getModel();
        tableModel.setNumRows(0);
        
        /**
         * Percorre o ArrayList preenchendo o TableModel
         */
        for (Model.EspacoModel espaco : espacos) {
                        
            tableModel.addRow(new Object[]{
                    
                    espaco.getNome(),
                    espaco.getLotacao()
                                
                    });
            
        }
        
    }
    
    
    
    
}
