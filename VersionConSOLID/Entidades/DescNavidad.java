package VersionConSOLID.Entidades ;

public class DescNavidad implements TipoDesc{

  public int desc(){

    return 10 ;

  }

  public double calcDescAplicado( double precio){

    return precio*desc()/ 100 ;

  }

}