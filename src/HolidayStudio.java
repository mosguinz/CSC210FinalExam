// B2

import java.util.Scanner;

public class HolidayStudio {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String lang = promptLanguage();
            if (lang.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println(getGreetings(lang));
        }
    }

    public static String promptLanguage() {
        System.out.print("Enter favorite language: ");
        return scan.nextLine();
    }

    public static String getGreetings(String lang) {
        switch (lang.toLowerCase()) {
            case "vietnamese":
                return "Chúc Giáng Sinh an lành và Năm Mới hạnh phúc!";
            case "indonesian":
                return "Selamat natal dan tahun baru!";
            case "english":
                return "Merry Xmas and Happy New Year!";
            default:
                return "";
        }
    }
}
