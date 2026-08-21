package Day_3;

class EcommerceProduct {
    String name;
    int price;
    String category;
    public EcommerceProduct(String name, int price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public void display(){
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
    }
}
class physicalProduct extends EcommerceProduct{
    int weight;
    String dimensions;
    public physicalProduct(String name, int price, String category, int weight, String dimensions){
        super(name, price, category);
        this.weight = weight;
        this.dimensions = dimensions;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Dimensions: " + dimensions);
    }
}
class DigitalProduct extends EcommerceProduct{
    String fileSize;
    String format;
    public DigitalProduct(String name, int price, String category, String filesize, String formate){
        super(name, price, category);
        this.fileSize = filesize;
        this.format = formate;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("File Size: " + fileSize);
        System.out.println("Format: "+ format);
    }
}
public class Inheritance{
    public static void main(String[] args){
        System.out.println("--Creating Ecommerce Inventory--");
        physicalProduct physical = new
physicalProduct("Laptop", 1000, "Electronics", 2, "16x12x2 inches");
        DigitalProduct digital = new DigitalProduct("E-Book", 10, "Education", "5MB", "PDF");
        System.out.println("Physical Product: ");
        physical.display();
        System.out.println("\nDigital Product: ");
        digital.display();
    }
}