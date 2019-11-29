import card.StandardCard;
import org.junit.jupiter.api.Test;

import static card.CardStatus.SILVER;
import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {
    @Test
    void checkCardStatusUpdates(){
        Client client = new Client(1,new StandardCard(),15007);
        ClientService service = new ClientService();

        service.checkCardStatusUpdates(client);

        assertEquals(SILVER,client.getCard().getCardStatus());
    }



}