package VersionSinSOLID;

public class NotifCorreo implements Notificador{

  public void enviarCorreo( String nomCtaSteam ){

    System.out.println("Email enviado a tu correo") ;

  }

  public void enviarSMS( String nomCtaSteam ){

    System.out.println("El notificador de correo no envia SMS") ;

  }

}