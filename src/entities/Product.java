package entities;

//Classe product com construtor

public class Product {

	//atributos da classe

	private String name;
	private double price;
	private int quantity;

	//por convensão os metodos contrutores vem apos os atributos
	//construtor padrão para que possa ser utilizado sem parametros obrigatorios.
	
	public Product() {
	}


	//Construtor da classe, serve para dar a obrigatoriedade de que o usuario informe os dados do produto no momento de sua instanciação
	
	public Product(String name, double price, int quantity) {
		// o this serve para referenciar o atributo da classe, e não o parametro passado
		// no construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	// sobrecarga é disponibilizar mais de um metodo com o mesmo nome, mas com parametros diferentes

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//por convensão os metodos get e set são colocados apos os construtores.
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		double total = price * quantity;
		return total;

	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f ", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f ", totalValueInStock());
	}
}
