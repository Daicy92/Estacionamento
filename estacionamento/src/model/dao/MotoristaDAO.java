/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import model.bean.Motorista;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author mateu
 */
public class MotoristaDAO {
    public void create(Motorista m){
     Connection con = ConnectionFactory.getConnection();
     PreparedStatement stmt = null;
     try{
         stmt = con.prepareStatement("INSERT INTO motorista (nomeCompleto, genero,RG,CPF, celular, email, senha) VALUES (?,?,?,?,?,?,?)");
         stmt.setString(1, m.getNomeCompleto());
         stmt.setString (2, m.getGenero());
         stmt.setInt (3, m.getRG());
         stmt.setInt (4, m.getCPF());
         stmt.setInt (5, m.getCelular());
         stmt.setString (6, m.getEmail());
         stmt.setString (7, m.getSenha());
         
         
         stmt.executeUpdate();
         JOptionPane.showMessageDialog (null, "Vaga salva com sucesso!");
         
     }catch (SQLException e){
         JOptionPane.showMessageDialog (null, "Erro ao salvar:" + e);
     }finally {
         ConnectionFactory.closeConnection(con, stmt);
     }
   }  
    public List<Motorista> read(){
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      ResultSet rs = null;
      List<Motorista> motorista = new ArrayList<>();
      try{
          stmt = con.prepareStatement("SELECT * FRON motorista;");
          rs = stmt.executeQuery();
          while(rs.next()){
          Motorista m = new Motorista ();
          m.setIdMotorista(rs.getInt("idMotorista"));
          m.setNomeCompleto(rs.getString("nomeCompleto"));
          m.setGenero(rs.getString("genero"));
          m.setRG(rs.getInt("RG"));
          m.setCPF(rs.getInt("CPF"));
          m.setCelular(rs.getInt("celular"));
          m.setEmail(rs.getString("email"));
          m.setSenha(rs.getString("senha"));
          
          motorista.add(m);
      }
      }catch (SQLException e){
          throw new RuntimeException("Erro de buscar os dados: ", e);
          
      }finally{
          ConnectionFactory.closeConnection(con, stmt, rs);
          
      }
      return motorista;
  } 
    
}
