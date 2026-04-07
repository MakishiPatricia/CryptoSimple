package model;


//* Obejto com atributos encapsulados(GET e SET) */

public class moeda {
   private int id;
   private String nome;
   private double preco;
   private java.sql.Timestamp dataRegistro;


   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   public String getNome() {
       return nome;
   }

   public void setNome(String nome) {
       this.nome = nome;
   }

   public double getPreco() {
       return preco;
   }

   public void setPreco(double preco) {
       this.preco = preco;
   }

   public java.sql.Timestamp getDataRegistro() {
       return dataRegistro;
   }

   public void setDataRegistro(java.sql.Timestamp dataRegistro) {
       this.dataRegistro = dataRegistro;
   }


}