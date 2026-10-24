package VersionConSOLID.LogicaDeNegocio ;
import VersionConSOLID.Entidades.TipoDesc ;
import VersionConSOLID.Notificaciones.EnviarCorreos;
import VersionConSOLID.Notificaciones.EnviarSMS ;

public class Steam{

  private Calculadora calculadora ;
  private Factura fact ;
  private TipoDesc tipoDesc ;
  private EnviarCorreos notifCorreo ;
  private EnviarSMS notifSMS ;

  public Steam( Calculadora calculadora , Factura fact , TipoDesc tipoDesc , EnviarCorreos notifCorreo , EnviarSMS notifSMS ){

    this.calculadora = calculadora;
    this.fact = fact;
    this.tipoDesc = tipoDesc;
    this.notifCorreo = notifCorreo;
    this.notifSMS = notifSMS;

    
  }

  public void pagar( String juego , double precio , String nomCtaSteam ){

    int descuento = tipoDesc.desc();

    double descAplicado = calculadora.calcDescAplicado(precio, tipoDesc) ;

    double total = calculadora.calcTotal(precio, descAplicado);

    fact.mostrRecibo(juego, precio, descuento, descAplicado, total) ;

    notifCorreo.enviarCorreo(nomCtaSteam);

    notifSMS.enviarSMS(nomCtaSteam) ;

  }

}