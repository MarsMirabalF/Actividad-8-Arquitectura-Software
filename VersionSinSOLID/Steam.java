package VersionSinSOLID;

public class Steam {

  public void pagar( String juego , double precio , String tipoDesc , String nomCtaSteam ){

    double descuentoAplicado=0;
    int descuento=0;

    if(tipoDesc.equals("hallowen")){

      descuentoAplicado= precio*50 /100;
      descuento =50 ;

    } else if(tipoDesc.equals("navidad")){

      descuentoAplicado= precio*10 /100; 
      descuento=10;

    } else if(tipoDesc.equals("ninguno")){

      descuentoAplicado= 0;
      descuento = 0 ;

    } else {

      descuentoAplicado= 0;

    }

    double total = precio-descuentoAplicado ;

    System.out.println("Recibo");

    System.out.println("Juego: " +juego);

    System.out.println("Precio: " +precio);

    System.out.println("Descuento: " + descuento +"%");

    System.out.println("Descuento aplicado: "+ descuentoAplicado);

    System.out.println("Total: "+ total);

    Notificador notifCorreo = new NotifCorreo() ;
    Notificador notifSMS = new NotifSMS() ;
 
    notifCorreo.enviarCorreo(nomCtaSteam);

    notifSMS.enviarSMS(nomCtaSteam) ;

  }

}