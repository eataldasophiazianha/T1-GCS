package src;
class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private String departament;

    public Product(int id, String name, String category, double price, String departament) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDepartament(){
        return departament;
    }

    public void setDepartament(String departament){
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}