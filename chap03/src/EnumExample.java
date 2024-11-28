enum CardType{
    DEBIT , CREDIT , PREPAID
}


public class EnumExample {
    public static void main(String[] args) {
        CardType myCardType = CardType.PREPAID;
        // 카드타입 저장할공간 필요

        switch(myCardType) {
            case DEBIT:
                System.out.println("Debit Card");
                break;
            case CREDIT:
                System.out.println("Credit Card");
                break;
            case PREPAID:
                System.out.println("Prepaid Card");
                break;
            default:
                System.out.println("Invalid card type");
                break;
        }
    }
}
