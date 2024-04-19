class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    // Thêm sản phẩm vào cuối danh sách
    public void addProduct(Product product) {
        Node newNode = new Node(product);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Xóa sản phẩm theo id
    public void removeProduct(int id) {
        if (head == null) return;

        if (head.product.getId() == id) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.product.getId() == id) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        Node current = head;
        while (current != null) {
            System.out.println(current.product);
            current = current.next;
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void searchProductByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.product.getName().equalsIgnoreCase(name)) {
                System.out.println(current.product);
            }
            current = current.next;
        }
    }

    // Sắp xếp sản phẩm theo giá tăng dần
    public void sortProductsByPriceAscending() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            Node current = head;
            swapped = false;
            while (current.next != null) {
                if (current.product.getPrice() > current.next.product.getPrice()) {
                    Product temp = current.product;
                    current.product = current.next.product;
                    current.next.product = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
