import java.util.Scanner;

public class imc {
    public static void main(String[] args) throws Exception {
        
        Scanner imcInputs = new Scanner(System.in);

        int peso;
        double altura;
        String nome;
  
        
        System.out.println("Olá, Qual o seu nome?");
        nome = imcInputs.next();

        System.out.println("Digite seu peso por favor COM NUMEROS INTEIROS.");
        peso = imcInputs.nextInt();
                
        System.out.println("Agora, Digite sua altura!");
        altura = imcInputs.nextDouble();

        double imc = (peso / (altura * altura));
        
        System.out.printf("Bem vindo %s! \n", nome);
        System.out.printf(" Seu IMC é: %.2f", imc);

        imcInputs.close();

    }
}