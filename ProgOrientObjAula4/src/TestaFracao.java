
public class TestaFracao {

	public static void main(String[] args) {
		
		Fracao f1;//f1 eh uma variavel de referencia para um objeto da classe fracao
				
		f1 = new Fracao(1,2);// cria objeto fracao => construtor da classe (eh o construtor que cria o objeto na memoria)
		
		//f1.numerador = 1;
		//f1.denominador = 2;
		
		Fracao f2 = new Fracao();
		
		System.out.println("Fração 1: " + f1.toString());
		System.out.println("Fração 2: " + f2.toString());
		
		//testaSoma fracoes
		Fracao f3 = new Fracao(1,2);
		Fracao f4 = new Fracao(3,4);
		
		System.out.println("Fração 3: " + f3.toString());
		System.out.println("Fração 4: " + f4.toString());
		System.out.println("Soma f3+f4: "+ f3.somaFracao(f4));
		
		//testa soma fracaoInteiro
		Fracao f5 = new Fracao(1,2);
				
		System.out.println("Fração 5: " + f5.toString());
		System.out.println("Soma f5 + 2: " + f5.somaFracao(2));
		
		//testaMulti
		Fracao f6 = new Fracao(5,2);
		Fracao f7 = new Fracao(2,5);
		
		System.out.println("Fração 6: " + f6.toString());
		System.out.println("Fração 7: " + f7.toString());
		System.out.println("Multiplição f6*f7: "+ f6.multiplicacaoFracao(f7));
		
		//testaDivisao
		Fracao f8 = new Fracao(5,2);
		Fracao f9 = new Fracao(2,5);
		
		System.out.println("Fração 8: " + f8.toString());
		System.out.println("Fração 9: " + f9.toString());
		System.out.println("Divisão f8/f9: "+ f8.divisaoFracao(f9));
		
		//testaIgualdade
		Fracao f10 = new Fracao(5,10);
		Fracao f11 = new Fracao(1,2);
		
		System.out.println("Fração 10: " + f10.toString());
		System.out.println("Fração 11: " + f11.toString());
		System.out.println("São Iguais? : "+ f10.testaIgualdade(f11));
		
		

	}

}
