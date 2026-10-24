package VersionSinSOLID;

import java.util.Scanner ;

public class Main{
  public static void main(String[] args){

    Scanner escanersito= new Scanner(System.in) ;

    System.out.print("Nombre de cuenta de Steam: ") ;
    String nomCtaSteam =escanersito.nextLine();

    Steam compraJueguito =new Steam() ;

    compraJueguito.pagar("Resident Evil 4 Remake" , 70.0, "hallowen" , nomCtaSteam) ;
 
  }

}