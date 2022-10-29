package org.generation;
import java.util.Scanner;
public class Codigo4 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String j1 = sc.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    
    String j2 = sc.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijera") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
            }
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  }
  
}