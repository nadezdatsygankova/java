import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist= new ArrayList<String>();
    desertIslandPlaylist.add("Time to bed");
    desertIslandPlaylist.add("Soon...");
    desertIslandPlaylist.add("Sun");    desertIslandPlaylist.add("Love");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(3);
    System.out.println(desertIslandPlaylist);
    int number = desertIslandPlaylist.indexOf("Sun");
    String songA = desertIslandPlaylist.get(number);
    desertIslandPlaylist.set(number,"Soon...");
    desertIslandPlaylist.set(1,songA);

    System.out.println(desertIslandPlaylist);

  }
  
}
