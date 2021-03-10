public class Main {
    public static void main(String[] args) {
      int income = 1500;
      int bonusStep = 100;
      if (income >= 1000) {
          int bonus = income / bonusStep;
          System.out.println(bonus);
      } else {
          int bonus = 0;
          System.out.println(bonus);
      }
    }
}
