package Day_3;

class SmartPhone {
    String brand;
    String model;
    int Storage;
    
    void displayDetails(){
        System.out.println(brand + " " + " " + model + " " + "with" + " " + Storage + "GB.Storage");
    }
}
public class ClassObjectExample{
    public static void main(String[] args){
        SmartPhone phone1 = new SmartPhone();
        phone1.brand = "Samsung";
        phone1.model = "S27";
        phone1.Storage = 128;

        SmartPhone phone2 = new SmartPhone();
        phone2.brand = "Iqoo";
        phone2.model = "Z10R";
        phone2.Storage = 256;


        phone1.displayDetails();
        phone2.displayDetails();
    }
}
