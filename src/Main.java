import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 1
        int[] MondaysExpenses = new int[]{10000, 80000, 22000, 27000, 52000};

        int totalSum = 0;
        for (int expense : MondaysExpenses) {
            totalSum += expense;
        }

        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей.");


        //task 2
        int[] MondaysExpenses2 = new int[]{10, 20, 5, 1000, 150};
        Arrays.sort(MondaysExpenses2);
        System.out.println("Минимальная сумма трат за неделю составила " + MondaysExpenses2[0] + "  рублей. Максимальная сумма трат за неделю составила " + MondaysExpenses2[MondaysExpenses2.length - 1] + " рублей.");

        //task 3
        float[] MondaysExpenses3 = new float[]{52, 66, 91, 240, 144};
        float allCosts = 0;
        for (float i : MondaysExpenses3) {
            allCosts += i;
        }

        float averageValue = allCosts / MondaysExpenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");

        //task 4
        char[] Name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int left = 0;
        int right = Name.length - 1;
        while (left < right) {
            char temp = Name[left];
            Name[left] = Name[right];
            Name[right] = temp;
            left++;
            right--;
        }
        for (char i : Name) {
            System.out.print(i);
        }
    }

}