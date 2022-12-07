public class CreditPaymentService {
    public double calculate(double s, double m) {
        double monthlyPayment = s * 0.08325 / (1 - (1 / (1 + 0.08325)) m );
        return monthlyPayment;
    }
}
//
//Pmt = s * 9.99% / [ 1 - (1 / (1 + 9.99%) )m ]
//
//где s - сумма кредита,  n - количество месяцев, на которое берется кредит