package database;

import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection minhaConexao = Conexao.getConexao();
        if (minhaConexao != null){
            System.out.println("Conexão estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao estabelecer conexão.");
        }
        
    }
}
