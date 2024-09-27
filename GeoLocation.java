public class Poem {
   private String name;


   public Poem(String yourName) {
       name = yourName;
   }


   public void printPoem(String color) {
       printFirstPart(color);
       System.out.println("And this last line rhymes with " + color);
   }


   public void printFirstPart(String str) {
       printFirstLines("you");
       printSecondLines(str, "awesome");
   }


   public void printFirstLines(String word) {
       System.out.println("Hello " + name + "!");
       System.out.println("I have a poem for " + word);
       printLine3("pink");
   }


   public void printSecondLines(String str1, String str2) {
       System.out.println(printLine4(str1));
       System.out.println("AP CSA is " + str2);
   }


   public void printLine3(String color) {
       System.out.println("Roses are " + color);
   }


   public String printLine4(String str) {
       return "Violets are " + str;
   }
}
