package card;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Card {
    private CardStatus cardStatus;

    private int bonusPerThousand;
    private int termExchangeGoods;
    private int percentageOfServicesRefund;
    private int additionalWarrantyPeriod;

    private boolean additionalInformationServices;
    private boolean customizedSpecialOffers;
    private boolean reservationOfGoods;
    private boolean dedicatedLineInHelpDesk;

    public Card(CardStatus cardStatus, int bonusPerThousand,
                int termExchangeGoods, int percentageOfServicesRefund,
                int additionalWarrantyPeriod, boolean additionalInformationServices,
                boolean customizedSpecialOffers, boolean reservationOfGoods,
                boolean dedicatedLineInHelpDesk) {

        this.cardStatus = cardStatus;
        this.bonusPerThousand = bonusPerThousand;
        this.termExchangeGoods = termExchangeGoods;
        this.percentageOfServicesRefund = percentageOfServicesRefund;
        this.additionalWarrantyPeriod = additionalWarrantyPeriod;
        this.additionalInformationServices = additionalInformationServices;
        this.customizedSpecialOffers = customizedSpecialOffers;
        this.reservationOfGoods = reservationOfGoods;
        this.dedicatedLineInHelpDesk = dedicatedLineInHelpDesk;
    }
}

