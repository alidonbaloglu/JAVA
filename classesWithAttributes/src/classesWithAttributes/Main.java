package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product =new Product(1, "LAptop", "Asus Laptop", 2000, 2, "Siyah");
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		product.setPrice(5000);*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		//34. Video
		
	}

}
