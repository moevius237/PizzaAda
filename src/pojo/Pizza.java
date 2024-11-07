package pojo;

public class Pizza {
    private int id;
    private String name;
    private String size;
    private double price;
    private String descripcion;

    public Pizza(int id, String name, String size, double price, String descripcion) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.descripcion = descripcion;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
