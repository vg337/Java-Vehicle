public class Boat extends Vehicle {  
    
	public Boat(String brand) {  
	    super(brand);  
	    this.setSound(true);  
	}
  
    public String sound() {
        return "glou glou";
    } 

   	public String doStuff(){
		return "Je suis " + this.getBrand() + ", j'ai " + this.getKilometers() + " de kilomètres et je fais " + this.sound() + " !";
   	}  
}