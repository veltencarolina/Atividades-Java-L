import java.util.Scanner;
public class AtividadeDeProgramacaoJava02{
    public static void main(String[] args)
     {   
		Scanner scan = new Scanner(System.in);
		
	int[] notas = new int[10];
	 int soma = 0;
	 
	for( int i = 0; i < notas.length; i++){
		
		System.out.println("Digite uma nota:" + ( i + 1));
		
		notas[i] = scan.nextInt();
		
		soma += notas[i];
			
	}	 
	
	double media = soma/10;
	
	System.out.println("Sua media é:"+ media);
	
	
	
	for(int i =0; i< notas.length ; i++){
	
	if(notas[i]>=7){
		
		i++;
		
	System.out.println("Parabens, aprovado!");
       }

      else {
		i++;
		System.out.println("Infelizmente reprovado");
	}
	
	 }
 }
}


	
	
	
 
	
	
	
	
	
	
	
	
