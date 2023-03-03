public class Main {
    public static void main(String[] args) {
        int availableAmount = 200;
        int depositAmount = 800;
        int bonus = depositAmount / 100 * 2;

        if (depositAmount > 800) {
            bonus = depositAmount / 100 * 2;
        }
        System.out.println(availableAmount + depositAmount + bonus);
        System.out.println(depositAmount / 100 * 2);
    }
}
