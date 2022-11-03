/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author mateu
 */
public class Motorista {
    private int idMotorista;
    private String nomeCompleto;
    private String genero;
    private int RG;
    private int CPF;
    private int celular ;
    private String email;
    private String senha;
    

    public int getIdMotorista() {
        return idMotorista;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getGenero() {
        return genero;
    }

    public int getRG() {
        return RG;
    }

    public int getCPF() {
        return CPF;
    }

    public int getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
