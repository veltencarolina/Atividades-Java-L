import java.util.Scanner;

public class AtividadeDeProgramacaoJava01{
    public static void main(String[] args)
     {   

Scanner scan = new Scanner(System.in);

int idade;

System.out.println("Digite sua idade: ");

idade = scan.nextInt();

if(idade< 16) {
	System.out.println("Não pode votar!");
}

else if ((idade >=16 && idade <= 17) || (idade > 65)) {
   System.out.println("Seu voto é facultativo");
}

else if ((idade >= 18 && idade <= 65)) { 
   System.out.println("Voto obrigatório");
}

else{
}
}
}
