import java.util.Scanner;  
public class AtividadeDeProgramacaoJava03 {  
    public static void main(String[] args) {

      int numero;
      int soma = 0;
      int contagem = 0;
      int media = 0;

Scanner  scan = new Scanner(System.in);

numero = scan.nextInt();

while(numero >= 0) {

 System.out.println("Digite um número");

soma = soma + numero;

contagem++;
}

if(contagem >= 0) {

media = soma/contagem;
System.out.println("quantidade de números: "+contagem);
System.out.println("Media dos números digitados: "+media);
}


else{
System.out.println("Número invalido!");
}

    }
}

