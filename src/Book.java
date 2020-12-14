public class Book {
    private String name;
    private String author;
    private int price;
    private int amount;
    private Double weight;


    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //Getters
    public int getTotalPrice()  {
        return this.amount * this.price;
    }
    public  Double getTotalWeight() {
        return this.weight * this.amount;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPrice() {
        return this.price;
    }
    public int getAmount() {
        return this.amount;
    }
    public Double getWeight() {
        return this.weight;
    }

}
