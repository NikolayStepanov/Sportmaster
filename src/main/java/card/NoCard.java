package card;

public class NoCard extends Card {
    private static final CardStatus cardStatus = CardStatus.NO;
    private static final int bonusPerThousand = 0;
    private static final int termExchangeGoods = 14;
    private static final int percentageOfServicesRefund = 0;
    private static final int additionalWarrantyPeriod = 0;

    private static boolean additionalInformationServices = false;
    private static boolean customizedSpecialOffers = false;
    private static boolean reservationOfGoods = false;
    private static boolean dedicatedLineInHelpDesk = false;

    public NoCard() {
        super(cardStatus, bonusPerThousand, termExchangeGoods,
                percentageOfServicesRefund, additionalWarrantyPeriod,
                additionalInformationServices, customizedSpecialOffers,
                reservationOfGoods, dedicatedLineInHelpDesk);
    }
}
