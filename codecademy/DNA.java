// program that determines whether there is a protein in a strand of DNA.

public class DNA {
  public static void main(String[] args){
     String dna1 = "ATGCGATACGCTTGA";
     String dna2 = "ATGCGATACGTGA";
     String dna3 = "ATTAATATGTACTGA";
 
     String dna = dna3;
     int length = dna.length();
     int indexStartCodon = dna.indexOf("ATG");
     System.out.println(indexStartCodon);
     int indexStopCodon = dna.indexOf("TGA");
      if(indexStartCodon !=-1 &&  indexStopCodon !=-1 && (length%3 == 0)){
          String protein = dna.substring(indexStartCodon,indexStopCodon+3);
          System.out.println(protein);
      }else{
        System.out.println("No protein.");
      }
  }
}
