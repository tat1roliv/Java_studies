import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = leitor.next();
        System.out.println("hola " + nome + "!");


        Scanner leNumero = new Scanner (System.in);
        System.out.print("Digite um numero: ");
        int numero = leNumero.nextInt();
        System.out.println("o número digitado foi: " + numero);
        
        int dobro = numero * 2;
        System.out.println("o dobro do numero é o: " + dobro);

    }
    
}

//classe do scanner
/*
next()
nextLine()
nextInt()
nextByte()
nextLong()
nextFloat()
nextDouble()
*/