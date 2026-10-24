package VersionConSOLID.Entidades ;

public class DescHalloween implements TipoDesc{

  public int desc(){

    return 50 ;

  }

  public double calcDescAplicado( double precio){

    return precio*desc()/ 100 ;

  }

}