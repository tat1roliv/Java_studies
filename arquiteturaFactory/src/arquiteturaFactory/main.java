package arquiteturaFactory;

import java.util.Scanner;

/**
 *
 * @author web
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaLuzFactory contaFactory = new ContaLuzFactory();
        String tipoPlano = "";
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("\nDigite o tipo de conta(Comercial/Residencial) ou q para sair: ");

        tipoPlano = entrada.next();


        if(!tipoPlano.trim().equalsIgnoreCase("q"))  {
            System.out.println("Digite a quantidade de MegaWatts: ");
            int unidadesMW = entrada.nextInt();

            ContaLuz conta = contaFactory.getContaLuz(tipoPlano);
            conta.setTaxa();
        
            System.out.println("\nTotal da Conta para o plano: " + tipoPlano + "\n");
            
            System.out.println("Tarifa: R$" + conta.getTaxa());
            System.out.println("Valor total (em reais):");
            conta.calcularFatura(unidadesMW);
            
        }

        }while(!tipoPlano.trim().equalsIgnoreCase("q"));

        System.out.println("Obrigado por usar nosso sistema!");

    }
    
}
