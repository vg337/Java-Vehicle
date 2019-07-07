public abstract class Vehicle {
  
    // attributs  
    private String brand;  
    private int kilometers;
    private boolean sound;  
  
    // constructeurs  
    public Vehicle(String brand) {  
        this.brand = brand;  
        this.kilometers = 0;
        this.sound = false;  
    }  
  
    // getters & setters  
    public String getBrand() {  
        return this.brand;  
    }  
  
    public void setBrand(String brand) {  
        this.brand = brand;  
    }  
  
    public int getKilometers() {  
        return this.kilometers;  
    }  
  
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public boolean isSound() {  
        return sound;  
    }  
    public void setSound(boolean sound) {  
        this.sound = sound;  
    }

    // méthodes
    public abstract String doStuff();
}
