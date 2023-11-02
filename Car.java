public class Car {
        private String model, brand, color;
        private int year, price, quantity;
        // Contructor
        Car(String model,String brand,String color,int year,int price,int quantity){
            this.model = model;
            this.brand = brand;
            this.color = color;
            this.year = year;
            this.price = price;
            this.quantity = quantity;
        }

    public String getModel(){ //getModel
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setModel(String model){ // set Model
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sellNoti(){ // Method Selling
        this.quantity = this.quantity - 1;
        System.out.println("Car is sold");
    }

    public void deliveryNoti(){ // Method Delivery
        this.quantity = this.quantity - 1;
        System.out.println("Delivery already");
    }

    public String toString() { // Method to String
        String output = "Model: " + this.model + "\nBrand: " + this.brand + "\nYear: " + this.year + "\nPrice: " + this.price + "\nColor: " + this.color + "\nQuantity: " + this.quantity;
        return output;
    }
}
