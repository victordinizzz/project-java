import java.util.Scanner;
 import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int molde = 0;
    int nun1 = 0;
    int numberRandom = 0;
    int numberAttempt = 1;
    String toTry = "s";
    int attempts = 0; 



    do{

      System.out.println("Vamos começar um jogo de adivinhação!");
      System.out.println("Vamos começar digite \n 1- modo facil (0-10) \n 2- modo medio(0-25) \n 3- modo dificil(0-50) \n 4- modo expert(0-100)");
      molde = scanner.nextInt();
      System.out.println("você gostaria de ter quantas tentativas para acertar?");
      attempts = scanner.nextInt();

      
    if(molde == 1 || molde == 2 || molde == 3 || molde == 4 ){

      System.out.println("escolha um numero");
      nun1 = scanner.nextInt();
      switch(molde){
        case 1:
          numberRandom = random.nextInt(10);
          while(numberAttempt < attempts){
          
          if(nun1 == numberRandom){
            System.out.println("Parabens você acertou o numero: " + numberRandom + " com " + numberAttempt + " tentativa");
          }else{
            if(numberAttempt < attempts){
              System.out.println("Você errou o numero tente novamente");
              nun1 = scanner.nextInt();
              numberAttempt++;
            }else{
              System.out.println("Você tentou todas é não acertou então pega seu banquinho e sai de fininho o numero era: " + numberRandom + " e você tentou " + numberAttempt);
            }
          }
        
          }
          
          break;
        case 2:
          numberRandom = random.nextInt(25);

          while(numberAttempt < attempts){

            if(nun1 == numberRandom){
              System.out.println("Parabens você acertou o numero: " + numberRandom + " com " + numberAttempt + " tentativa");
            }else{
              if(numberAttempt < attempts){
                System.out.println("Você errou o numero tente novamente");
                nun1 = scanner.nextInt();
                numberAttempt++;
              }else{
                System.out.println("Você tentou todas é não acertou então pega seu banquinho e sai de fininho o numero era: " + numberRandom + " e você tentou " + numberAttempt);
              }
            }

            }

          break;
          case 3:
          numberRandom = random.nextInt(50);

          while(numberAttempt < attempts){

            if(nun1 == numberRandom){
              System.out.println("Parabens você acertou o numero: " + numberRandom + " com " + numberAttempt + " tentativa");
            }else{
              if(numberAttempt < attempts){
                System.out.println("Você errou o numero tente novamente");
                nun1 = scanner.nextInt();
                numberAttempt++;
              }else{
                System.out.println("Você tentou todas é não acertou então pega seu banquinho e sai de fininho o numero era: " + numberRandom + " e você tentou " + numberAttempt);
              }
            }

            }

          break;
          case 4:
          numberRandom = random.nextInt(100);
          while(numberAttempt < attempts){

            if(nun1 == numberRandom){
              System.out.println("Parabens você acertou o numero: " + numberRandom + " com " + numberAttempt + " tentativa");
            }else{
              if(numberAttempt < attempts){
                System.out.println("Você errou o numero tente novamente");
                nun1 = scanner.nextInt();
                numberAttempt++;
              }else{
                System.out.println("Você tentou todas é não acertou então pega seu banquinho e sai de fininho o numero era: " + numberRandom + " e você tentou " + numberAttempt);
              }
            }

            }
          

          break;
        
      }
    
    }else{
      System.out.println("Escolha um modo valido");
    }


      
      System.out.println("Deseja jogar novamente? (S/N)");
      toTry = scanner.next();
    
      
      
    }while(toTry.equalsIgnoreCase("s")); 
    System.out.println("Obrigado por jogar!");
    System.out.println("Game Over");
      scanner.close();
 }
  
}
