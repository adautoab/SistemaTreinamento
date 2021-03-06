/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Modelagem da classe EspacoModel, que implementa os Espaços de Café do Sistema
 * @author User
 */
public class EspacoModel {
   
    private int Id;
    private String Nome;
    private int Lotacao;

    /**
     * Construtor da classe
     * @param Id
     * @param Nome
     * @param Lotacao 
     */
    public EspacoModel(int Id, String Nome, int Lotacao) {
        this.Id =Id;
        this.Nome = Nome;
        this.Lotacao = Lotacao;
    }

    
    
    /**
     * Getters e Setters da classe EspacoModel
     * @return 
     */
    public int getId() {
        return Id;
    }

    /**
     * Getters e Setters da classe EspacoModel
     * @param Id 
     */
    public void setId(int Id) {
        this.Id = Id;
    }
    
    /**
     * Getters e Setters da classe EspacoModel
     * @return 
     */ 
    public String getNome() {
        return Nome;
    }

    /**
     * Getters e Setters da classe EspacoModel
     * @param Nome 
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Getters e Setters da classe EspacoModel
     * @return 
     */
    public int getLotacao() {
        return Lotacao;
    }

    /**
     * Getters e Setters da classe EspacoModel
     * @param Lotacao 
     */  
    public void setLotacao(int Lotacao) {
        this.Lotacao = Lotacao;
    }
    
    @Override
    public String toString(){
        return getNome();
    } 
    
    
}
