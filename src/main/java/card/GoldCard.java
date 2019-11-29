package card;

public class GoldCard extends Card {
    private static final CardStatus cardStatus = CardStatus.GOLD;
    private static final int bonusPerThousand = 100;
    private static final int termExchangeGoods = 60;
    private static final int percentageOfServicesRefund = 100;
    private static final int additionalWarrantyPeriod = 60;

    private static boolean additionalInformationServices = true;
    private static boolean customizedSpecialOffers = true;
    private static boolean reservationOfGoods = true;
    private static boolean dedicatedLineInHelpDesk = true;

    public GoldCard() {
        super(cardStatus, bonusPerThousand, termExchangeGoods,
                percentageOfServicesRefund, additionalWarrantyPeriod,
                additionalInformationServices, customizedSpecialOffers,
                reservationOfGoods, dedicatedLineInHelpDesk);
    }
}
