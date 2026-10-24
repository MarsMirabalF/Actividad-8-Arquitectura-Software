package VersionSinSOLID;

public class SteamRegalo extends Steam {

  public void pagar( String juego , double precio ,  String tipoDesc , String nomCtaSteam ){

    System.out.println("Un regalo no se paga") ;

  }

  public void regalo( String juego , double precio , String tipoDesc  , String nomCtaSteam , String nomCtaSteamRegalo){
    
    System.out.println("Recibo") ;

    System.out.println("Juego: "+ juego) ;

    System.out.println("Precio: " +precio) ;

    System.out.println("Descuento: "+100 +"%") ;
 
    System.out.println("Descuento aplicado: "+ precio);

    System.out.println("Total: " +0) ;

    System.out.println("Comprobante enviado a tu correo " +nomCtaSteam) ;

  }

}