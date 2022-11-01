public class mortgageDownPayment {

    public static void main(String[] args) {

        final int apartmentPrice = 2000000;
        System.out.println("Стоимость квартиры: " + apartmentPrice);

        final double downPaymentPercentage = 0.10;
        System.out.println("Процент первоначального взноса: " + downPaymentPercentage * 100);

        final double sumDownPayment = apartmentPrice * downPaymentPercentage;
        System.out.println("Сумма первоначального взноса: " + sumDownPayment);


    }
}