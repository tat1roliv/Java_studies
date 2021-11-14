// Implementa��o da classe No
public class No {
	private No proximo; // aponta para o pr�ximo No da Lista
	private Object elemento; // armazena o elemento de cada No

	public No(Object elemento, No proximo) // construtor classe No
	{
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public void setProximo(No proximo) // m�todo que altera pr�ximo No da Lista
	{
		this.proximo = proximo;
	}

	public No getProximo() // m�todo que recebe o pr�ximo No da Lista
	{
		return proximo;
	}

	public void setElemento(Object elemento) // m�todo para alterar o elemento
	{
		this.elemento = elemento;
	}

	public Object getElemento() // m�todo para receber o objeto contido no No
	{
		return elemento;
	}
}
// Final da classe No