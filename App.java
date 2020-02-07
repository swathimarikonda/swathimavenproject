package com.epamtask1.candiesswa;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App{// class for sweets
	public class Sweets{
	double weight;
	double price;
	double sugarPercent;
	String name;
	String producer;
	public Sweets() {
		super();
		
	}
	public Sweets(double weight,double price,double sugarPercent,String name,String producer) {
		super();
		this.weight=weight;
		this.price=price;
		this.sugarPercent=sugarPercent;
		this.name=name;
		this.producer=producer;
	}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return price;
	}
	public double getSugarPercent() {
		return sugarPercent;
	}
	public Sweets setWeight(double weight) {
		this.weight=weight;
		return this;
	}
	public Sweets setPrice(double price) {
		this.price=price;
		return this;
	}
	public Sweets setSugarPercent(double sugarPercent) {
		this.sugarPercent=sugarPercent;
		return this;
	}
	public String getName() {
		return name;
	}
	public String getProducer() {
		return producer;
	}
	public Sweets setName(String name) {
		this.name=name;
		return this;
	}
	public Sweets setProducer(String producer) {
		this.producer=producer;
		return this;
	}
	public void calculateSugarPercent() {
		double calculateSugarPercent=getWeight()*getSugarPercent();
		System.out.println(calculateSugarPercent);
	}
	}
	class Candies extends Sweets{
	    Candies(){}
	    Candies(double weight,double price,double sugarPercent,String name, String producer){
	    	super(weight,price,sugarPercent,name,producer);
	    }
	        public  void calculateSugarPercent(){
	            double calculateSugarPercent = (getWeight()*getSugarPercent()*getSugarPercent()/getSugarPercent()*0.04);
	            System.out.println(calculateSugarPercent);
	        }
	    }
	class Chocolates extends Sweets{
	    Chocolates(){
	    }
	    Chocolates(double weight, double price,double sugarPercent, String name, String producer){
	    	super(weight,price,sugarPercent,name,producer);
	    }
	        public void calculateSugarPercent(){
	            double calculateSugarPercent = getWeight()+getWeight()*0.03+getSugarPercent();
	            System.out.println(calculateSugarPercent);
	        }
	    }
	public class NewYearGift{
	    String name;
	    double weight;
	    ArrayList<Sweets> newyeargift;
	    NewYearGift(){
	        newyeargift = new ArrayList<Sweets>();
	    }
	    NewYearGift(String name, Sweets...components){
	        this.name=name;
	        newyeargift=new ArrayList<Sweets>();
	        for (Sweets s : components){
	            this.newyeargift.add(s);
	        }
	    }
	    String getName(){return name;}

	    public NewYearGift setName(String name){
	        this.name=name;
	        return this;
	    }
	    public NewYearGift setComponent(Sweets s){
	        this.newyeargift.add(s);
	        return this;
	    }

	    void getWeight(double weight){
	        this.weight+=weight;
	    }

	    double getWeight(){
	        for (Sweets w:newyeargift){
	            weight+=w.getWeight();
	        }
	        return weight;
	    }
	    public String toString(){
	        final StringBuilder sb = new StringBuilder("New Years Gift have been created with name:");
	        sb.append("[ ").append(name).append("] and with:");
	        sb.append(" weight ").append(getWeight());
	        return sb.toString();
	    }
	}
	class Vafels extends Sweets{
	    Vafels(){
	    }

	    Vafels(double weight,double price, double sugarPercent, String name,String producer){
	        super(weight,price,sugarPercent,name,producer);
	    }
	    public void calculateSugarPercent(){
	        double calculateSugarPercent=(getWeight()*getSugarPercent())+10;
	        System.out.println(calculateSugarPercent);
	    }
	}
    public static void main( String[] args )
    {
    	NewYearGift root = new NewYearGift();
        NewYearGift newyeargift1 = new NewYearGift("sweetest gift", new Vafels(25,25,40,"Artec","Artec LTD."),new Candies(500,120,100,"Zoryane Syaivo","Svitoch"), new Chocolates(120,34,98,"Korona with nuts","Korona"));
        System.out.println(newyeargift1);
        //System.out.println(newyearCandies);


        //sweets objects
        Vafels vafel1 = new Vafels(25,25,40,"Artec","Artec Ltd.");
        Candies candy1 = new Candies(500,120,100,"Zoryane Syaivo","Svitoch");
        Chocolates chocolate1 = new Chocolates(120,34,98,"Korona with nuts","Korona");
        System.out.println("Sugar percent of Vafels ");
        vafel1.calculateSugarPercent();
        System.out.println("Sugar percent of Candies ");
        candy1.calculateSugarPercent();
        System.out.println("Sugar percent of Chocolate ");
        chocolate1.calculateSugarPercent();

    }
}
