import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        char[] charArray = new char[6];
        int m = 0;
        System.out.println("Дан массив со строками: String[] stringArray = {\"ab\", \"cd\", \"ef\"}. Получите массив символов этих строк: char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'}.");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; 1 > j; j++) {
                charArray[m] = stringArray[i].charAt(j);
                m++;
                charArray[m] = stringArray[i].charAt(j + 1);
                m++;
            }
        }
        System.out.println(Arrays.toString(charArray));
        System.out.println("Дана строка: String stroke = \"12345\". Выведите в консоль значение, которое можно, взяв первый и последний символ этой строки в следующем виде. Т.е. \"15\".");
        String stroke = "12345";
        char world0 = stroke.charAt(0);
        char world4 = stroke.charAt(4);
        String result = String.valueOf(world0) + String.valueOf(world4);
        System.out.println(result);
        System.out.println("Дана некоторая строка - \"1203405\". Найдите позицию первого нуля в строке. Т.е. позиция первого нуля в этой строке равна 2");
        String Stroke = "1203405";
        System.out.println(Stroke.indexOf("0"));
    }


}