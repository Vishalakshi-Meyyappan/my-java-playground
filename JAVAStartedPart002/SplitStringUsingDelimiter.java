package JAVAStartedPart002;

import java.util.Scanner;

public class SplitStringUsingDelimiter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String[] arrSplit = str1.split(str1 + ": "); //using "," is coming, but ":" is not coming...
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
    }
}

/*
class StrSplit{
  public static void main(String []args){
   String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
    String[] arrSplit = strMain.split(", ");
    for (int i=0; i < arrSplit.length; i++)
    {
      System.out.println(arrSplit[i]);
    }
  }
}
 */