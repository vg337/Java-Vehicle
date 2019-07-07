public class Car extends Vehicle{ // 1 clas = 1 héritage
	
	// rapel du constructeur
	public Car(String brand) {  
        super(brand);
        this.setSound(true);  
    }

    public String sound() {  
        return "vroum vroum!";  
    }

	public String doStuff(){
		return "Je suis " + this.getBrand() + ", j'ai " + this.getKilometers() + " de kilomètres et je fais " + this.sound() + " !";
   	
   	}
}