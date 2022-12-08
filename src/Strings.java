public class Strings {
    public static void main(String[] args) {
        insertSeparator();
        task5();
        insertSeparator();
        task6();
        insertSeparator();
        task7();
        insertSeparator();
    }

    public static void insertSeparator() {
        System.out.println("================================================================================");
    }

    public static void task5() {
//  Задача 5
//  Необходимо написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
//  В качестве исходных данных используйте: Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
//  строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
//  переменная firstName — для хранения имени; переменная middleName — для хранения отчества;
//  переменная lastName — для хранения фамилии.
//  Решите задание с помощью метода substring().
//  Результат программы выведите в формате:
//  “Имя сотрудника — …”
//  “Фамилия сотрудника — …”
//  “Отчество сотрудника — ...”
        System.out.println("Задача 5");
        String fullName = "Иванов Иван Иванович";
        int index1 = fullName.indexOf(" ");
        int index2 = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(0, index1);
        String firstName = fullName.substring(index1 + 1, index2);
        String middleName = fullName.substring(index2, fullName.length());
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

    public static void task6() {
//  Задача 6
//  Напишите программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
//  В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать
//  в “Ivanov Ivan Ivanovich”. Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника
//  с заглавных букв — …”
        System.out.println("Задача 6");
        String fullName = "иванов сергей иванович";
        fullName = changeFirstLetters(fullName);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
    }

    public static String changeFirstLetters(String fullName) {
        char[] fullNameCharArray = fullName.toCharArray();
        for (int i = 0; i < fullNameCharArray.length; i++) {
            if (i == 0) {
                fullNameCharArray[i] = Character.toUpperCase(fullNameCharArray[i]);
            } else if (fullNameCharArray[i] == ' ') {
                fullNameCharArray[i + 1] = Character.toUpperCase(fullNameCharArray[i + 1]);
            }
        }
        fullName = new String(fullNameCharArray);
        return fullName;
    }

    public static void task7() {
//  Задача 7
//  Имеется две строки. Первая: "135" Вторая: "246"
//  Соберите из двух строк одну, содержащую данные "123456". Использовать сортировку нельзя.
//  Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
//  Выведите результат в консоль в формате: “Данные строки — ….”
        System.out.println("Задача 7");
        StringBuilder str = new StringBuilder("135");
        str.append("246");
        char num1 = str.charAt(3);
        char num2 = str.charAt(4);
        char num3 = str.charAt(5);
        str.delete(3, 6);
        str.insert(1, num1);
        str.insert(3, num2);
        str.insert(5, num3);
        System.out.println("Данные строки — " + str);
    }
}