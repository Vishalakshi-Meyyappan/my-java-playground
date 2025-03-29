package HackerEarthSums;

import java.util.Scanner;

public class SmallesVowel {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        String word=ab.nextLine();
        int i=0;

        char large='u';
        for(i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(ch<large)
                {

                    large=ch;
                }
            }
        }

        System.out.println(large);
    }   
}
