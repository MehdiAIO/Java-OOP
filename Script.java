public class Script {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food f1 = new Food("pizza", 3.80);
        Food f2 = new Food("sushi", 23.07);
        Food f3 = new Food("ramen", 7.33);

        refrigerator[0] = f1;
        refrigerator[1] = f2;
        refrigerator[2] = f3;

        // Food[] refrigerator = {f1,f2,f3};

        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i]);
        }

    }
}
