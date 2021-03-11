public class Main {
    public static void main(String[] args) {
        int income = 1_500;
        int bonusStep = 100;
        int bonus;
        if (income >= 1_000) {
            bonus = income / bonusStep;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
