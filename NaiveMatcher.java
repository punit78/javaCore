import java.util.*;
public class NaiveMatcher
{
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the Text:");
      String text=input.nextLine();
      System.out.println("Enter the Pattern:");
      String pattern=input.nextLine();
      int i,j;
      int n=text.length();
      int m=pattern.length();
      for( i=0;i<=n-m;i++)
      {
          for(j=0;j<m;j++)
          {
              if(!(text.charAt(j+i)==pattern.charAt(j)))
              break;
          }
          if(j==m)
          {
          System.out.println("Pattern found at index: "+ i);
          continue;
          }

      }
    }
}