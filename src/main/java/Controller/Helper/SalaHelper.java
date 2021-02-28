/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.SalaModel;
import View.Sala;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class SalaHelper implements IHelper{
    
    private final Sala view;

    public SalaHelper(Sala view) {
        this.view = view;
    }

    @Override
    public SalaModel obterModelo() {
        String nome = view.getjTextFieldNome().getText();
        String lotacaoString = view.getjTextFieldLotacao().getText();
        int lotacao = Integer.parseInt(lotacaoString);
        
        SalaModel sala = new SalaModel(0, nome, lotacao);
        return sala;
    }

    @Override
    public void limparTela() {
        view.getjTextFieldNome().setText("");
        view.getjTextFieldLotacao().setText("");
    }

    public void preencherTabela(ArrayList<SalaModel> salas) {
        
DefaultTableModel tableModel = (DefaultTableModel) view.getjTableSala().getModel();
        tableModel.setNumRows(0);
        
        // percorrer a lista preenchendo o tableModel
        
        for (SalaModel sala : salas) {
                    
            tableModel.addRow(new Object[]{
                    
                    sala.getNome(),
                    sala.getLotacao()
                                
                    });
            
        }
                        
                    
        
    }
    
    
}
