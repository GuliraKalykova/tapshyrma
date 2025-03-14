//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эшикте аба ырайы кандай экен?");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("Бүгүн суук экен. Калыңыраак кийин.");
        } else if (temperature <= 20) {
            System.out.println("Жылуу экен. Жеңил эле куртка кий.");
        } else {
            System.out.println("Эшик ысык. Футболка эле кий");
        }


        // Баалоо системасы

        System.out.println("Сынактан канча алдың?");
        float score = scanner.nextFloat();
        if (score >= 90 && score <= 100) {
            System.out.println("Сынактан 5 (эң жакшы) алдым");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Сынактан 4 (жакшы) алдым");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Сынактан 3 (орто) алдым");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Сынактан 2 (канааттандыраарлык) алдым");
        } else {
            System.out.println("Ката!: 0 дон 100 гө чейинки гана санды жазыңыз!");
        }

        // Аптанын кайсы күнү?

        System.out.println("1 ден 7 ге чейинки санды жазыңыз");
        int day =scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Дүйшөмбү");
                break;
            case 2:
                System.out.println("Шейшемби");
                break;
            case 3:
                System.out.println("Шаршемби");
                break;
            case 4:
                System.out.println("Бейшемби");
                break;
            case 5:
                System.out.println("Жума");
                break;
            case 6:
                System.out.println("Ишемби");
                break;
            case 7:
                System.out.println("Жекшемби");
                break;
            default:
                System.out.println("Аптада 7 эле күн бар");
        }

        // Меню

        System.out.println("Тандаңыз:");
        System.out.println("1 - Эсептөө");
        System.out.println("2 - Курстун тизмеси");
        System.out.println("3 - Чыгуу");
        System.out.println("Номер жазыңыз:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1 - Эсептөө");
                break;
            case 2:
                System.out.println("2 - Курстун тизмеси");
                break;
            case 3:
                System.out.println("3 - Чыгуу");
                break;
            default:
                System.out.println("!!!Ката");
        }
        scanner.close();


        }
    }