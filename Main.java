import java.util.Scanner;

public class Main {

    static void countGlas(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = " " + in.nextLine();
        int count = 0;
        char[] pattern = new char[]{'а','о','э','и','у','ы','е','ё','ю','я','А','О','Э','И','У','Ы','Е','Ё','Ю','Я'};
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == ' '){
                for (int j = 0; j < pattern.length; j++) {
                    if(str.charAt(i + 1) == pattern[j]) count++;
                }
            }
        }
        System.out.println("Кол-во слов начигающихся с гласной:"+count+"\n");
    }



    static void length3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine() + " %end";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next();
        int count=1;
        if(word.length()==3)
            System.out.println(count);
        while(word.compareTo("%end") != 0){
            count++;
            word = strScanner.next();
            if(word.length() == 3) System.out.println(count);;
        }
    }


    static void Maxlength(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine() + " %end";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next(), maxWord = word;
        while(word.compareTo("%end") != 0){
            word = strScanner.next();
            if(word.length() >= maxWord.length()) maxWord = word;
        }
        System.out.println("Слово максимальной длины:"+maxWord+"\n");
    }


    public static void main(String[] args) {
        countGlas();
        length3();
        Maxlength();
    }
}