package database;

import dao.FavotitosDAO;
import model.moeda;

public class TesteSalvar {
    
    public static void main(String[] args) {
        moeda moeda = new moeda();
        moeda.setNome("Bitcoin");
        moeda.setPreco(50000.0);


        /*INSTACIAR FavotitosDAO */
        new FavotitosDAO().salvarMoeda(moeda);
        
    }
}
