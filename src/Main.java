public class Main {
    public static void main(String[] args)
    {
        /// Задача 1
        System.out.println("Задача 1");
        byte clientOS1 = 0;
        switch (clientOS1){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверно указана ОС");
        }


        /// Задача 2
        System.out.println("Задача 2");
        byte clientOS2 = 0;
        short age2 = 2013;
        switch (clientOS2){
            case 0:
                if (age2 < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (age2 < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверно указана ОС");
        }


        /// Задача 3
        System.out.println("Задача 3");
        short year = 2000;
        if (year >= 1584){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                System.out.println(year + " год является високосным");
            }
            else
                System.out.println(year + " год не является високосным");
        }


        /// Задача 4
        System.out.println("Задача 4");
        int i = 0;
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            i = i + 1;
            System.out.println("Потребуется дней: " + i);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            i = i + 2;
            System.out.println("Потребуется дней: " + i);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            i = i + 3;
            System.out.println("Потребуется дней: " + i);
        }
        else
            System.out.println("Свыше 100 км доставки нет");


        /// Задача 5
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Это зимний месяц");
                break;
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
                System.out.println("Это весенний месяц");
                break;
            case 4:
                System.out.println("Это весенний месяц");
                break;
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
                System.out.println("Это летний месяц");
                break;
            case 7:
                System.out.println("Это летний месяц");
                break;
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
                System.out.println("Это осенний месяц");
                break;
            case 10:
                System.out.println("Это осенний месяц");
                break;
            case 11:
                System.out.println("Это осенний месяц");
                break;
            case 12:
                System.out.println("Это зимний месяц");
                break;
            default:
                System.out.println("Ошибка ввода данных");
        }
    }
}