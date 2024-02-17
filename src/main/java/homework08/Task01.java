package homework08;
/*
   Напечатать в консоль все парные числа от 1 до 20
 */
public class Task01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

