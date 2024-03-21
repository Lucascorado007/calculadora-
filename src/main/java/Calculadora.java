import java.util.Scanner;

class Calculadora{
  private int numero1;
  private int numero2;
  private int total;

  Scanner ler = new Scanner(System.in);
  public void soma(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    
    int total;
    System.out.println("calculadora de soma\n\nInsira o 1° numero: ");
    calc.setNumero1(n1.nextInt());
    System.out.println("Insira o 2° numero: ");
    calc.setNumero2(n1.nextInt());
    total = calc.getNumero1() + calc.getNumero2();
    System.out.println("\nO resultado é: "+total);
    
  }


  
  
  

  public int getNumero1(){
    return numero1;
  }
  public void setNumero1(int numero1){
    this.numero1 = numero1;
  }
  public int getNumero2(){
    return numero2;
  }
  public void setNumero2(int numero2){
    this.numero2 = numero2;
  }
  public int getTotal(){
    return total;
  }
  
}