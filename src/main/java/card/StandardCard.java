package card;

public class StandardCard extends Card {
    private static final CardStatus cardStatus = CardStatus.STANDARD;
    private static final int bonusPerThousand = 50;
    private static final int termExchangeGoods = 14;
    private static final int percentageOfServicesRefund = 20;
    private static final int additionalWarrantyPeriod = 0;

    private static boolean additionalInformationServices = true;
    private static boolean customizedSpecialOffers = true;
    private static boolean reservationOfGoods = true;
    private static boolean dedicatedLineInHelpDesk = false;

    public StandardCard() {
        super(cardStatus, bonusPerThousand, termExchangeGoods,
                percentageOfServicesRefund, additionalWarrantyPeriod,
                additionalInformationServices, customizedSpecialOffers,
                reservationOfGoods, dedicatedLineInHelpDesk);
    }
}
