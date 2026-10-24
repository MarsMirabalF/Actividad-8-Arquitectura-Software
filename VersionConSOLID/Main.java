package VersionConSOLID;

import java.util.Scanner;

import VersionConSOLID.Entidades.DescHalloween;
//import VersionConSOLID.Entidades.DescNavidad;
//import VersionConSOLID.Entidades.Regalo;
//import VersionConSOLID.Entidades.SinDescuento;
import VersionConSOLID.Entidades.TipoDesc;
import VersionConSOLID.LogicaDeNegocio.Calculadora;
import VersionConSOLID.LogicaDeNegocio.Factura;
import VersionConSOLID.LogicaDeNegocio.Steam;
import VersionConSOLID.Notificaciones.EnviarCorreos;
import VersionConSOLID.Notificaciones.EnviarSMS;
import VersionConSOLID.Notificaciones.NotifCorreo;
import VersionConSOLID.Notificaciones.NotifSMS;


public class Main{
  public static void main(String[] args){

    Scanner escanersito = new Scanner(System.in) ;

    System.out.println("Nombre de cuenta de Steam: ") ;
    String nomCtaSteam = escanersito.nextLine();

    String juego = "Resident Evil 4 Remake" ;
    double precio = 70.0 ;

    Calculadora calculadora = new Calculadora() ;
    Factura fact = new Factura() ; 
    TipoDesc descHalloween = new DescHalloween();
    //TipoDesc descNavidad = new DescNavidad() ;
    //TipoDesc sinDescuento = new SinDescuento();
    //TipoDesc regalo = new Regalo() ;
    EnviarCorreos notifCorreo = new NotifCorreo();
    EnviarSMS notifSMS = new NotifSMS() ;

    Steam compraJueguito = new Steam( calculadora , fact , descHalloween , notifCorreo , notifSMS );

    compraJueguito.pagar( juego , precio , nomCtaSteam );

  }

}