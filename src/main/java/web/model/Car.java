package web.model;

public class Car {
    private String model;
    private int serias;
    private String namber;

    public Car(String model, int serias, String namber) {
        this.model = model;
        this.serias = serias;
        this.namber = namber;
    }

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerias() {
        return serias;
    }

    public void setSerias(int serias) {
        this.serias = serias;
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    @Override
    public String toString() {
        return  model + " "  + serias + " " + namber;
    }
}
