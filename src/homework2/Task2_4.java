package homework2;

public class Task2_4 {
    public static void main(String[] args){
    Processor processor1 = new Processor("Intel", "i7", 7, 3.2, 300);
    System.out.println(processor1);
    }
}

final class Processor{                                    //immutable class

    private String manufacturer;
    private String model;
    private int generation;
    private double maxFrequency;
    private int price;

    public Processor(String manufacturer, String model, int generation, double maxFrequency, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.generation = generation;
        this.maxFrequency = maxFrequency;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getGeneration() {
        return generation;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", generation=" + generation +
                ", maxFrequency=" + maxFrequency +
                ", price=" + price + "$"+
                '}';
    }
}