package adsproject;
import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	// variáveis criadas junto a um valor
	
		int voto, PT = 0, PDT = 0, PL = 0, PSDB = 0, votonulo = 0, votoembranco = 0;
		
		// laço repetitivo até alcançar determinado número de informações estipuladas
		
		for(int i = 0; i <= 49; i++) {
		System.out.println(" digite um numero para o respectivo voto: \r\n- 1 - (13) PT;\r\n- 2 - (12) PDT;\r\n- 3 - (22) PL;\r\n- 4 - (45) PSDB;\r\n- 5 - voto nulo;\r\n- 6 - voto em branco");
		voto = read.nextInt();
		
		// condição if, realizar a captura de informação junto ao calculo 
		
		if(voto == 1) {
			PT = PT + 1; 
		}
		else if(voto == 2) {
			PDT = PDT + 1;
		}
		else if(voto == 3) {
			PL = PL + 1;
		}
		else if(voto == 4) {
			PSDB = PSDB + 1;
		}
		else if(voto == 5) {
			votonulo = votonulo + 1;
		}
		else if(voto == 6) {
			votoembranco = votoembranco + 1;
		}
		
		// condição nagativa, printar texto negativo caso tenha erro de digitação 
		
		else {
			System.out.println("Numero Invalido");
		}
		
		//printar resultados diante calculos base
		
		}
		System.out.println("Total de votos para cada candidato: ");
		System.out.println(PT + " - PT");
		System.out.println(PDT + " - PDT");
		System.out.println(PL + " - PL");
		System.out.println(PSDB + " - PSDB");
		System.out.println("Total de votos nulos e brancos: ");
		System.out.println(votonulo + " - Voto Nulo");
		System.out.println(votoembranco + " - Voto em branco");
	
	
	}

}
