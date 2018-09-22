
public class Product {
    private String name;
    private int price;
    private int orderNumber;
    private String productOwner;

    public Product(int orderNumber, String name, int price, String productOwner) {
        this.name = name;
        this.price = price;
        this.orderNumber = orderNumber;
        this.productOwner=productOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(String productOwner) {
        this.productOwner = productOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getPrice() != product.getPrice()) return false;
        if (getOrderNumber() != product.getOrderNumber()) return false;
        if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
        return getProductOwner() != null ? getProductOwner().equals(product.getProductOwner()) : product.getProductOwner() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getPrice();
        result = 31 * result + getOrderNumber();
        result = 31 * result + (getProductOwner() != null ? getProductOwner().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", orderNumber=" + orderNumber +
                ", productOwner='" + productOwner + '\'' +
                '}';
    }
}
