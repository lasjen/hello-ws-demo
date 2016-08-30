package no.right;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by lassejenssen on 30/08/16.
 */
public class RandTextGen {
   static public String getRandomMan() {
      ArrayList l = new ArrayList();
      Random r = new Random();
      int min = 1;
      int choice;

      l.add("Elvis Presley");
      l.add("Chuck Norris");
      l.add("Bob Marley");
      l.add("Ronald Reagen");
      l.add("David Bowie");
      l.add("David Backham");
      l.add("Mel Gibson");
      l.add("Larry Allison");

      int max = l.size();

      choice = r.nextInt(max - min + 1) + min;

      return l.get(choice).toString();
   }
}
