package projcets.contra;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;


    private String color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // No Argument Constructor
    public Product() {
        this.name = "No name";
        this.description = "No description";
        this.price = 50.554f;
        this.quantity = 0;
        this.discount = 0;
    }

    // Argument Constructor
    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        System.out.println("Constructor 5 arguments");
    }

    //changing constructor ==> calling constructor from anther constructor
    public Product(String name, String description, float price, int quantity, float discount, String color) {
        //changing constructor ==> calling constructor from anther constructor
        this(name, description, price, quantity, discount);
        this.color = color;
        System.out.println("Constructor 6 arguments");

    }

    // Default Constructor
    //    public Product() {
    //
    //    }

    // Copy constructor ==> calling constructor from anther constructor
    public Product(Product obj) {
        this(obj.name, obj.description, obj.price, obj.quantity, obj.discount, obj.color);

    }

    @Override
    public String toString() {
        return "Product{" + '\n' +
                "name='" + name + '\n' +
                " description='" + description + '\n' +
                " price=" + price + '\n' +
                " quantity=" + quantity + '\n' +
                " discount=" + discount + '\n' +
                '}';
    }
}
