package card;

public class SilverCard extends Card {
    private static final CardStatus cardStatus = CardStatus.SILVER;
    private static final int bonusPerThousand = 70;
    private static final int termExchangeGoods = 30;
    private static final int percentageOfServicesRefund = 50;
    private static final int additionalWarrantyPeriod = 30;

    private static boolean additionalInformationServices = true;
    private static boolean customizedSpecialOffers = true;
    private static boolean reservationOfGoods = true;
    private static boolean dedicatedLineInHelpDesk = false;

    public SilverCard() {
        super(cardStatus, bonusPerThousand, termExchangeGoods,
                percentageOfServicesRefund, additionalWarrantyPeriod,
                additionalInformationServices, customizedSpecialOffers,
                reservationOfGoods, dedicatedLineInHelpDesk);
    }
}
