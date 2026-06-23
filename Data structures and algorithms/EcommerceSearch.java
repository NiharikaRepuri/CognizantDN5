public class EcommerceSearch {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        Product result = SearchService.linearSearch(products, "Shoes");

        if (result != null) {
            System.out.println("Product Found");
            System.out.println("ID: " + result.productId);
            System.out.println("Name: " + result.productName);
            System.out.println("Category: " + result.category);
        } else {
            System.out.println("Product Not Found");
        }
    }
}