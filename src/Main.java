public class Main {
    public static void main(String[] args) {
        int availableAmount = 500; // начальная сумма на счёте//
        int amountForBonuses = 1000; // сумма для начисления бонусов//
        int replenishment = 1600; // сумма пополнения//
        int bonus = replenishment / 100; // расчёт бонуса//

        if (replenishment > amountForBonuses) {
            bonus = replenishment / 100;
        }
        System.out.println(availableAmount + replenishment + bonus); // итоговая сумма
        System.out.println(bonus); // бонусы
    }
}