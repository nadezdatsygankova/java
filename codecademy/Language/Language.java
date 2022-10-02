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
  public void setRigionsSpoken(String regionSpoken){
   this.regionsSpoken = regionsSpoken;
  }

  public void setNumSpeakers(int numSpeakers){
   this.numSpeakers = numSpeakers;
  }
   public void setWordOrder(String wordOrder){
   this.wordOrder = wordOrder;
  }

  public static void main (String[] args){

    Language eng = new Language ("English", 2000000, "Canada", "subject-verb-object");
    Mayan chontal = new Mayan("Chontal", 36810);
    SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 920000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);

    Language[] languages = {eng,chontal,chinese,burmese};
    for(Language language: languages){
      language.getInfo();
    }
  }
}
