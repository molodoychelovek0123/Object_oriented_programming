import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split("\\s");
        boolean bool;
        //Циклом foreach перебираем все слова в строке
        for (String word : words) {
            bool = isPalindrome(word);
        }
    }
    //Метод reverseString создаёт новую строку и заполняет её начиная с последнего символа исходной строки
    public static String reverseString(String s){
        String str = "";
        for(int i = s.length() -1; i >= 0; --i){
            str += s.charAt(i);
        }
        return str;
    }
    //isPalindrome сверяет строки с помощью встроенной функции equals и выводит ответ в зависимости от выполнения условия
    public static boolean isPalindrome(String s){
        if(s.equals(reverseString(s))){
            System.out.print(s+" - Палиндром ");
        }
        else
            System.out.print(s+" - Не палиндром ");
        System.out.print('\n');
        return s.equals(reverseString(s));
    }
}