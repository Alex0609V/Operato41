public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        System.out.println("Задача 2");
        int clientOS2 = 1;
        int yearOfIssue = 2023;
        if (yearOfIssue < 2015 && clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("нет");

        }
        int yer = 2015;
        int clientOs2 = 1;
        int clientDivaceYer = 2024;
        if (clientOS2 == 0 && clientDivaceYer < yer) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDivaceYer >= yer) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDivaceYer > yer) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDivaceYer >= yer) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        System.out.println("Задача 3");
        int year = 2033;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

            System.out.println("Высокостный год");
        } else {
            System.out.println(" Не высокостный год");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 100;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 60) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 100) {
            deliveryDay+=2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставок нет!");
        }


        System.out.println("Задача 5");
        int monthNumber =13;
        if (monthNumber > 12 ) {
            switch (monthNumber) {
                case 12, 1, 2 -> System.out.println("Зима");
                case 3, 4, 5 -> System.out.println("Весна");
                case 6, 7, 8 -> System.out.println("Лето");
                case 9, 10, 11 -> System.out.println("Осень");
                default -> System.out.println("Нет дальше месяца!");
            }
        }
    }
}







