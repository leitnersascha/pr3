package at.campus02.pr3.fileio.ue11_text_io;

public class Product {

    public String ProductName;
    public Double Price;
    public String ProductCategory;


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public Product(String productName, Double price, String productCategory) {
        ProductName = productName;
        Price = price;
        ProductCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + ProductName + '\'' +
                ", Price=" + Price +
                ", ProductCategory='" + ProductCategory + '\'' +
                '}';
    }
}
