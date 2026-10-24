package VersionConSOLID.LogicaDeNegocio;
import VersionConSOLID.Entidades.TipoDesc ;

public class Calculadora {

  public double calcDescAplicado( double precio , TipoDesc desc){

      return desc.calcDescAplicado(precio) ;
  }

  public double calcTotal( double precio , double descApli ){

    return precio-descApli ;

  }

}