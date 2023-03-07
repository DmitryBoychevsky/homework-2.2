public class Main {
    public static void main(String[] args) {
        int availableAmount = 500;
        int amountForBonuses = 1000;
        int replenishment = 1600;
        int bonus = replenishment / 100;

        if (replenishment > amountForBonuses) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(availableAmount + replenishment + bonus);
        System.out.println(bonus);
    }

}


