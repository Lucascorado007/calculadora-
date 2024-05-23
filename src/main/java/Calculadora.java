import java.util.Scanner;

class Calculadora{
  private float numero1;
  private float numero2;
  private float total;

  Scanner ler = new Scanner(System.in);
  

  
  
  public void soma(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();
    
    float total;
    System.out.println("calculadora de soma\n\nInsira o 1° numero: ");
    calc.setNumero1(n1.nextFloat());
    System.out.println("Insira o 2° numero: ");
    calc.setNumero2(n1.nextFloat());
    total = calc.getNumero1() + calc.getNumero2();
    System.out.println("\nO resultado é: "+total);
    
  }

  public void mult(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    float total;
    System.out.println("calculadora de multiplicação\n\nInsira o 1° numero: ");
    calc.setNumero1(n1.nextFloat());
    System.out.println("Insira o 2° numero: ");
    calc.setNumero2(n1.nextFloat());
    total = calc.getNumero1() * calc.getNumero2();
    System.out.println("\nO resultado é: "+total);

  }


  
  public void sub(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    float total;
    System.out.println("calculadora de subtração\n\nInsira o 1° numero: ");
    calc.setNumero1(n1.nextFloat());
    System.out.println("Insira o 2° numero: ");
    calc.setNumero2(n1.nextFloat());
    total = calc.getNumero1() - calc.getNumero2();
    System.out.println("\nO resultado é: "+total);
  }
  public void div(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    float total;
    System.out.println("calculadora de divisão\n\nInsira o 1° numero: ");
    calc.setNumero1(n1.nextFloat());
    System.out.println("Insira o 2° numero: ");
    calc.setNumero2(n1.nextFloat());
    total = calc.getNumero1() / calc.getNumero2();
    System.out.println("\nO resultado é: "+total);
  }
 
  
  
  

  public Float getNumero1(){
    return numero1;
  }
  public void setNumero1(float numero1){
    this.numero1 = numero1;
  }
  public float getNumero2(){
    return numero2;
  }
  public void setNumero2(float numero2){
    this.numero2 = numero2;
  }
  public float getTotal(){
    return total;
  }
  
}