package VersionSinSOLID;

public class NotifSMS implements Notificador{

  public void enviarCorreo( String nomCtaSteam ){

    System.out.println("El notificador de SMS no envia correo") ;

  }

  public void enviarSMS( String nomCtaSteam ){

    System.out.println("SMS enviado al su telefono") ;

  }

}