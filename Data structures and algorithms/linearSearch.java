public static Product linearSearch(Product[] products, String key) {
    for (Product product : products) {
        if (product.productName.equalsIgnoreCase(key)) {
            return product;
        }
    }
    return null;
}