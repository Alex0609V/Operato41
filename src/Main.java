public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        System.out.println("Задача 2");
        int clientOS2 = 1;
        int yearOfIssue = 2023;
        if (yearOfIssue > 2015 && clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("нет");

        }
        switch (clientOS2) {
            case 0 -> {
                if (yearOfIssue > 2015) {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");

                }
//               System.out.println("Андроид");
            }
            case 1 -> {
                if (yearOfIssue > 2015) {
                    System.out.println("Установите обычную версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");

                }
                //     System.out.println("IOS");
            }
            default -> System.out.println("не известный кл ");

        }
        System.out.println("Задача 3");
        int year = 2033;
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

            System.out.println("Высокостный год");
        } else {
            System.out.println(" Не высокостный год");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 175;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                deliveryDay++;
                System.out.println("Потребуется дней: " + deliveryDay);
            } else {
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    deliveryDay += 2;
                    System.out.println("Потребуется дней: " + deliveryDay);
                } else {
                    if (deliveryDistance > 100) {
                        System.out.println("Доставок нет!");
                    }
                    System.out.println("Задача 5");
                    int monthNumber = 13;
                    switch (monthNumber) {
                        case 12 -> {
                            System.out.println("Зима");
                            break;
                        }
                        case 1 -> {
                            System.out.println("Зима");
                            break;
                        }
                        case 2 -> {
                            System.out.println("Зима");
                            break;
                        }
                        case 3 -> {
                            System.out.println("Весна");
                            break;

                        }
                        case 4 -> {
                            System.out.println("Весна");
                            break;
                        }
                        case 5 -> {
                            System.out.println("Весна");
                            break;
                        }
                        case 6 -> {
                            System.out.println("Лето");
                            break;
                        }
                        case 7 -> {
                            System.out.println("Лето");
                            break;
                        }
                        case 8 -> {
                            System.out.println("Лето");
                            break;
                        }
                        case 9 -> {
                            System.out.println("Осень");
                            break;
                        }
                        case 10 -> {
                            System.out.println("Осень");
                            break;
                        }
                        case 11 -> {
                            System.out.println("Осень");
                            break;

                        }
                    }
                }
            }
        }
    }
}