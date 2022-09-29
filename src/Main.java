public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2016;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите версию для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке ");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }//Задание 3
        }
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "является високосным");
        } else {
            System.out.println(year + "не является високосным");
        }

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance1 = 95;
        int daysForDelivery = 1;
        if (deliveryDistance1 < 20) {
            System.out.println("Потребуется дней" + daysForDelivery);
        } else if (deliveryDistance1 < 60) {
            daysForDelivery = daysForDelivery + 1;
            System.out.println("Потребуется дней" + daysForDelivery);
        } else if (deliveryDistance1 < 100)
            daysForDelivery = daysForDelivery + 2;
        System.out.println("Потребуется дней:" + daysForDelivery);

        //Задание 5
        System.out.println("Задание 5");
        int monthNumber=3;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона не существует!");
        }

    }
}


