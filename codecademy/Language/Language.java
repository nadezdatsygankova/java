class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name; 
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
  } 

  public void getInfo(){
       System.out.println(this.name + "is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken +".");
       System.out.println("The language follows the word order: " + this.wordOrder +".");
  }

  public static void main (String[] args){
    Language eng = new Language ("English", 2000000, "Canada", "subject-verb-object");
    eng.getInfo();

    Mayan chontal = new Mayan("Chontal", 36810);
    chontal.getInfo(); 

    SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 920000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
    chinese.getInfo(); 
    burmese.getInfo(); 

  }
}
