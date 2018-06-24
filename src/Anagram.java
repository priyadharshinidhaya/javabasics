import java.util.Arrays;
public class Anagram {
   public static void main(String args[]) {
      String str1 = "recitals";
      String str2 = "articles";
      String s3,s4;
      if (str1.length()==str2.length()) {
         char[] arr1 =str1.toCharArray();
         Arrays.sort(arr1);
         System.out.println(s4=Arrays.toString(arr1));
         char[] arr2 = str2.toCharArray();
         Arrays.sort(arr2);
         System.out.println(s3=Arrays.toString(arr2));
         System.out.println(s4.equals(s3));
         if(s3.equals(s4)) {
            System.out.println("Given strings are anagrams");
         } else {
            System.out.println("Given strings are not anagrams");
         }
      }
   }
}
