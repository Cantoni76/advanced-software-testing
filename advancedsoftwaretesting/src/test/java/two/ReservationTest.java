package two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    public void TestCanBeCancelledByAdminCancellingReturnsTrue() {

        Reservation reservation = new Reservation();
        User adminUser = new User("Antal", "Raffai", true);

        boolean result = reservation.canBeCancelledBY(adminUser);

        assertEquals(true, result);

    }

    @Test
    public void TestCanBeCancelledBySameUserCancellingReturnTrue() {

        User user = new User("Antal", "Raffai", false);
        Reservation reservation = new Reservation(user);
        boolean result = reservation.canBeCancelledBY(user);
        assertEquals(true, result);


    }

    @Test
    public void TestCanBeCancelledByAnotherUserCancellingReturnsFalse(){
        User madeBy = new User();
        User anotherUser = new User();
        Reservation reservation = new Reservation(madeBy);
        boolean result = reservation.canBeCancelledBY(anotherUser);
        assertEquals(false, result);
    }


}
