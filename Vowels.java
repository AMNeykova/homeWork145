import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        String line = "This website is aw3som3.";
        int character=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");

        char ch=scanner.next( ).charAt(0);

        switch(ch)
        {
            case  'a' :
            case 'e'  :
            case 'i'   :
            case 'o'  :
            case 'u'  :
            case  'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :ch++;
        }
        if(character==1)

            System.out.println("Entered character "+character+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent");
        else
            System.out.println("Not an alphabet");
    }
}


