public class CreditPaymentService {
    public double calculate(int credit, int time, double percent) {
        double creditRate = percent / 12 / 100;              // ставка в месяц
        double degree = Math.pow(1 + x, time);              // стерень 
        double annuity = creditRate * degree / (degree-1); // аннуитет
        double payment = annuity * credit;
        return payment;
    }

}