import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Task 1.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Task 2.
        String fullNameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameBig);

        // Task 3.
        String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Иванов";
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);

    }
}