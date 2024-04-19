public class Main {
    public static void main(String[] args) {
        CustomLinkedList productList = new CustomLinkedList();
        productList.addProduct(new Product(1, "Laptop", 1200.00));
        productList.addProduct(new Product(2, "Smartphone", 700.00));
        productList.displayProducts();

        System.out.println("After deleting:");
        productList.removeProduct(1);
        productList.displayProducts();

        System.out.println("Searching for Smartphone:");
        productList.searchProductByName("Smartphone");

        productList.addProduct(new Product(3, "Tablet", 300.00));
        System.out.println("Sorted by price ascending:");
        productList.sortProductsByPriceAscending();
        productList.displayProducts();
    }
}
