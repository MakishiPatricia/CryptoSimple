package dao;

import java.sql.PreparedStatement;

import database.Conexao;
import model.moeda; /* Importa a classe moeda para usar seus atributos e métodos. */

/* 1. Pede uma conexão para a classe Conexao.

  2. Prepara o comando SQL (o "INSERT").

  3.Pega os dados que estão dentro do objeto Moeda e coloca nas interrogações ? do SQL.

  4.Manda o banco executar.
  
  5. Resumindo: Faz a conexão + insere os dados + executa o comando SQL.
  */

public class FavotitosDAO {
    
    public void salvarMoeda(moeda moeda){

        String sql = "INSERT INTO favoritos (nome_moeda, preco_atual) VALUES (?, ?)"; 

        PreparedStatement st = null;

        try{

            st = Conexao.getConexao().prepareStatement(sql); 
            /*Definir os ? */
            st.setString(1, moeda.getNome());
            st.setDouble(2, moeda.getPreco());

            st.execute();
            st.close();

        }catch(Exception e){
            e.printStackTrace();

    }
}
}
