/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Modelagem da classe SalaModel que implementa uma sala no Treinamento
 * @author User
 */
public class SalaModel {
    
    private int Id;
    private String Nome;
    private int Lotacao;

    /**
     * Construtor da class
     * @param Id
     * @param Nome
     * @param Lotacao 
     */
    public SalaModel(int Id, String Nome, int Lotacao) {
        this.Id = Id;
        this.Nome = Nome;
        this.Lotacao = Lotacao;
    }

    /**
     * Getters e Setters da classe SalaModel
     * @return 
     */
    public int getId() {
        return Id;
    }

    /**
     * Getters e Setters da classe SalaModel
     * @param Id 
     */
    public void setId(int Id) {
        this.Id = Id;
    }
  
    /**
     * Getters e Setters da classe SalaModel
     * @return 
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Getters e Setters da classe SalaModel
     * @param Nome 
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Getters e Setters da classe SalaModel
     * @return 
     */
    public int getLotacao() {
        return Lotacao;
    }

    /**
     * Getters e Setters da classe SalaModel
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
