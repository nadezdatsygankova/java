public class Droid {
  String name;
  double batteryLevel;

  public Droid(String droidName){
   name = droidName;
   batteryLevel = 100;
  }

  public String toString(){
    return "Hello, I'm the droid: " + name;
  }

  public void energyReport(){
    System.out.println("Level battery:" + batteryLevel);
  }

  public void energyTransfer(int power, Droid transferTo){
     batteryLevel -= power;
    transferTo.batteryLevel += power;
    }
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }

  public static void main(String[] args){
   Droid newDroid = new Droid("Codey");
   System.out.println(newDroid);
   newDroid.performTask("dance");
   newDroid.energyReport();
   Droid newDroid2 = new Droid("Dort");
   System.out.println(newDroid2);
   newDroid2.performTask("song");
   newDroid2.energyReport();
   newDroid2.energyTransfer(20,newDroid);
  }
}
