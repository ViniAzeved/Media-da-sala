import java.util.Scanner;
public class ex11 {
    
    public static float media (float nota){

        if (nota >= 0.0 && nota <=4.9){
            System.out.println("D");
            }

        else if(nota >= 5.0 && nota <=6.9){
            System.out.println("C");
            }

        else if(nota >= 7.0 && nota <=8.9){
            System.out.println("B");
            }

        else if(nota >= 9.0 && nota <=10.0){
            System.out.println("A");
            }

        return nota;
    }

    public static void main(String[] args) {
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Digite a nota do aluno: ");
                float nota = sc.nextFloat();
                if (nota<=10.0 && nota >= 0){
                        media(nota);
                        break;
                    }
                System.out.println("Inválido");
            }
            catch(Exception InputMismatchException){
                System.out.println("Erro, digite um número inteiro!!");
            }
        }
    }
}
