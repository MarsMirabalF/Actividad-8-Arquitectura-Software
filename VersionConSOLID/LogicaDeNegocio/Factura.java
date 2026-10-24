package VersionConSOLID.LogicaDeNegocio;

public class Factura{

  public void mostrRecibo( String juego , double precio , int descuento , double descApli , double total ){

    System.out.println("Recibo") ;

    System.out.println("Juego: " +juego);

    System.out.println("Precio: "+ precio) ;

    System.out.println("Descuento: "+ descuento + "%");

    System.out.println("Descuento aplicado: "+ descApli) ;

    System.out.println("Total: " +total);

  }

}