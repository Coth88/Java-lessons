public class Main {

  public static void main(String[] args) {
    String text =
        "Now widely regarded as one of the best strikers in the world and the finest English goalscorer of his generation, Kane has come a long way since his lower-league loan struggles and fight to earn a regular start at Tottenham.\n"
            + "\n"
            + "Here, BBC Sport speaks to coaches, team-mates, opponents and colleagues from every stage of Kane's career to chart not only his rise but how he has evolved as a player on the way. The shortened pitch at Millwall's training ground meant the keeper could easily throw out to the young loanee striker lurking down the other end, but what Kane did next was anything but simple.\n"
            + "\n"
            + "With his eyes fixed on the ball as it fell over his shoulder, taking him away from goal, Kane had already decided his next move: he was going to shoot. Holding off the marker to his left, he wrapped his right boot around the dropping ball, sending a booming volley across to the far post and into the corner of the net.";
    System.out.println(splitTextIntoWords(text));
  }

  public static String splitTextIntoWords(String text) {
    if (text.equals("")) {
      return "";
    }
    String text1 = text.replaceAll("[^a-z A-Z’]", " ");
    String[] split = text1.split("\\s+");
    StringBuilder words = new StringBuilder();
    for (String s : split) {
      words.append(s).append(System.lineSeparator());
    }
    String word = words.toString().trim();
    return word;
  }
}