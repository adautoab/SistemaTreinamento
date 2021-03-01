/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Espaco;
import View.Pessoa;
import View.Sala;
import View.SistemaTreinamento;

/**
 * Implementa a classe controladora.
 * Tem acesso a view e faz a navegação da aplicação
 * @author Adauto
 */

public class SistemaTreinamentoController {

    private final SistemaTreinamento view;

    /**
     * Construtor da classe
     * @param view 
     */
    public SistemaTreinamentoController(SistemaTreinamento view) {
        this.view = view;
    }
    
    /**
     * Navegação para view Pessoa
     */
    public void navegarParaPessoa(){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setVisible(true);
        
    }

    /**
     * Navegação para view Sala
     */
    public void navegarParaSala() {
        Sala sala = new Sala();
        sala.setVisible(true);
    }

    /**
     * Navegação para view Espaco
     */
    public void navegarParaEspaco() {
        Espaco espaco = new Espaco();
        espaco.setVisible(true);
    }
    
}
