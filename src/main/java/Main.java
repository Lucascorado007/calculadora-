import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    int choince;
    do {
    menu();
    System.out.println("Escolha uma opção: ");
    choince = ler.nextInt();  
    
    
    switch(choince){
      case 1:
        calc.soma();
        break;
      case 2:
        calc.sub();
        break;
      case 3:
        calc.mult();
        break;
      case 4:
        calc.div();
        break;
      case 5:
        System.out.println("Encerrando programa:");
        break;

      default:
        System.out.println("Opção invalida");
        break;
    }
    }
    while(choince != 5);
    
    
    
      
    
  }
    
  
  public static void menu(){
      System.out.println("-----MENU-----");
      System.out.println("1 - soma");
      System.out.println("2 - subtração");
      System.out.println("3 - multiplicação");
      System.out.println("4 - divisão");
      System.out.println("5 - sair");
    }
}
 




