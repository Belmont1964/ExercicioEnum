package entidade;

public class OrderItem {
	private Integer quantity;
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Integer quantity,  Product product) {
		this.product = product;
		this.quantity = quantity;
	}

		
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTototal (Integer quantity, Product product) {
		Double subTotal = quantity * product.getPrice();
		return subTotal;
		
	}		
}