public class Car {
    private String brand;
    private int CP;
    private double CC;

    public Car(String brand, int CP, double CC) {
        this.brand = brand;
        this.CP = CP;
        this.CC = CC;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public double getCC() {
        return CC;
    }

    public void setCC(double CC) {
        this.CC = CC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", Cai Putere='" + CP + '\'' +
                ", Capacitate Cilindrica='" + CC + '\'' +
                '}';
    }
}

