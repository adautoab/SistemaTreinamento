/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Modelagem da classe PessoaInscrita que implemnta uma pessoa
 * que será inscrita no Treinamento
 * @author User
 */
public class PessoaInscrita {
 
    private int Id;
    private String Nome;
    private String Sobrenome;
    private SalaModel SalaEtapa1;
    private SalaModel SalaEtapa2;
    private EspacoModel EspacoEtapa1;
    private EspacoModel EspacoEtapa2;

    /**
     * Construtor da classe
     * @param Id
     * @param Nome
     * @param Sobrenome
     * @param SalaEtapa1
     * @param SalaEtapa2
     * @param EspacoEtapa1
     * @param EspacoEtapa2 
     */
    public PessoaInscrita(int Id, String Nome, String Sobrenome, SalaModel SalaEtapa1, SalaModel SalaEtapa2, EspacoModel EspacoEtapa1, EspacoModel EspacoEtapa2) {
        this.Id = Id;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.SalaEtapa1 = SalaEtapa1;
        this.SalaEtapa2 = SalaEtapa2;
        this.EspacoEtapa1 = EspacoEtapa1;
        this.EspacoEtapa2 = EspacoEtapa2;
    }


    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public int getId() {
        return Id;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param Id 
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    
    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public String getNome() {
        return Nome;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param Nome 
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public String getSobrenome() {
        return Sobrenome;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param Sobrenome 
     */
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public SalaModel getSalaEtapa1() {
        return SalaEtapa1;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param SalaEtapa1 
     */
    public void setSalaEtapa1(SalaModel SalaEtapa1) {
        this.SalaEtapa1 = SalaEtapa1;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public SalaModel getSalaEtapa2() {
        return SalaEtapa2;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param SalaEtapa2 
     */
    public void setSalaEtapa2(SalaModel SalaEtapa2) {
        this.SalaEtapa2 = SalaEtapa2;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public EspacoModel getEspacoEtapa1() {
        return EspacoEtapa1;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param EspacoEtapa1 
     */
    public void setEspacoEtapa1(EspacoModel EspacoEtapa1) {
        this.EspacoEtapa1 = EspacoEtapa1;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @return 
     */
    public EspacoModel getEspacoEtapa2() {
        return EspacoEtapa2;
    }

    /**
     * Getters e Setters da classe PessoaInscrita
     * @param EspacoEtapa2 
     */
    public void setEspacoEtapa2(EspacoModel EspacoEtapa2) {
        this.EspacoEtapa2 = EspacoEtapa2;
    }
    
    
    
       
}
