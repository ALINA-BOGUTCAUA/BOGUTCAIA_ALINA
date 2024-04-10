package homework_nr_6;

public class Invoice {
    private String model;
    private String description;
    private int numberOfProducts;
    private Double price;

    public Invoice(String model, String description, int numberOfProducts, Double price) {
        this.model = model;
        this.description = description;
        this.numberOfProducts = numberOfProducts;
        this.price = price;
    }

    public Double getAmount(int numberOfProducts, Double price){
        if (numberOfProducts < 0){
            numberOfProducts = 0;
        }
        if (price < 0d ){
            price = 0.0d;
        }
        Double Summa = numberOfProducts * price ;
        return  Summa ;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfProducts() {
        if(numberOfProducts < 0){
        return 0;
        } else { return numberOfProducts;}
    }

    public void setNumberOfProducts(int numberOfProducts) {
         this.numberOfProducts = numberOfProducts;
    }

    public Double getPrice() {
        if (price < 0.0d){
        return 0.0d;
        } else {return price;}
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
