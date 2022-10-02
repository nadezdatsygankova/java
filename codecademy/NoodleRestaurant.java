class Ramen extends Noodle {
  
  Ramen() {
    
    super(30.0, 0.3, "flat", "wheat flour");
    
  }
  
  @Override
  public String getCookPrep() {
    
    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    
  }
  
}

class Pho extends Noodle {
  
  Pho() {
    
    super(30.0, 0.64, "flat", "rice flour");
    
  }
  
  @Override
  public String getCookPrep() {
    
    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    
  }
  
}

class Noodle {
  
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  
}

class NoodleRestaurant {
  String name;

  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
    
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
    NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

    // Add your code here
    customer2.order(ramen);
    customer1.order(pho);



  }
}
