package Model;

public final class Produto  extends Dados{
	private String categotia;
	private double preco;
	private int  quantidade;
	
	public void adicionar() {
		this.setNome(null);
	}
	
	public void apagar() {
		
	}

	public String getCategotia() {
		return categotia;
	}

	public void setCategotia(String categotia) {
		this.categotia = categotia;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
