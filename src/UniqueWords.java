import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  String first;
	  String second;
	  
      for (int i = 0; i < list.size(); i++)
      {
    	  boolean falseFlag = false;
		  first = list.get(i);
    	  for (int j = 0; j < list.size(); j++)
    	  {
    		  second = list.get(j);
    		  if(first.compareTo(second) == 0 && j != i)
    			  falseFlag = true;
		  }
    	  if(falseFlag)
    		  continue;
    	  else
    		  count++;
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
