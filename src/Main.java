import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Задача 1

    int sum = 0;
    int [] arr = new int [] {25, 40, 35, 50, 65, 75, 80, 198, 205, 89, 13, 17, 15, 10, 5, 12, 24, 18, 20, 27, 48, 125, 148, 235, 267, 254, 198, 147, 1321, 300};
    for (int i =0; i< arr.length; i++) {
        sum +=arr[i];
    }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");


    //Задача 2
        System.out.println();

    int minSum = 500;
    int maxSum = 0;
    for (int j =0; j< arr.length; j++){
        if (arr[j] >maxSum) {
            maxSum=arr[j];
        }
        if (arr[j] <minSum) {
            minSum=arr[j];
        }
    }
        System.out.println("Минимальная сумма трат за день составила: " +  minSum + " рублей." + " Максимальная сумма трат за день составила: " + maxSum + " рублей.");

    //Задача 3
        System.out.println();

    int maxIndex= arr.length;
    double averageSum = (double) sum/maxIndex;

        System.out.printf("Средняя сумма трат за месяц составила  - %.2f" , averageSum, " рублей.");

    //Задача 4
        System.out.println();
        System.out.println();

        char [] information = new char [] {'n', 'a', 'v', 'I', ' ','v', 'o', 'n', 'a', 'v', 'I'};
        for (int p = information.length-1; p>=0;p--){

            System.out.print(information[p]);

        }
    }
}


