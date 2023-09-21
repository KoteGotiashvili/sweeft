public class MinSplit {
    public static void main(String[] args) {

        System.out.println(minSplit(5));

        }
          //1,5,10,20,50
        static int minSplit(int amount) {
        if(amount<0) return -1;
        if(amount<=5) return amount;
        if(amount%50==0) return amount/50;

            int[] coins = {50, 20, 10, 5, 1};
            int steps = 0;
            for (int i = 0; i < coins.length; i++) {
                //it only subtracts
                while (amount >= coins[i]) {
                    amount -= coins[i];
                    steps++;
                }
            }
            return steps;
        }

}