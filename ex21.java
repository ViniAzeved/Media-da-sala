import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos têm na sua sala?");
        int alunos = sc.nextInt();
        

        String nomes[] = new String[alunos+1];
        float notas[] = new float[alunos+1];

        for(int i=1; i<nomes.length; i++){
            
            System.out.println("Informe o nome do(a) " + i + "° aluno(a) :");
            nomes[i] = sc.next();

            System.out.println("Informe a nota do aluno(a) " + nomes[i] + " :");
            notas[i] = sc.nextInt();
        }

        float soma = 0;
        float div = 0;

        for(int i=1; i<nomes.length; i++){

            soma = soma + notas[i];
            div++;

        }
        float res = soma/div;
        System.out.println("A média da sala é : " + res + "\n");


        for(int i=1; i<nomes.length; i++){

            if(notas[i]>res){
                System.out.println("O(a) aluno(a) " + nomes[i] + " com a nota " + notas[i] + " está acima da média\n");
            }
            else
            System.out.println("Nenhum aluno está acima da média");
        }
    }
    
}
