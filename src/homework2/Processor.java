package homework2;

final class Processor{                                    //immutable class

    final private String manufacturer;
    final private String model;
    final private int generation;
    final private double maxFrequency;
    final private int price;

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