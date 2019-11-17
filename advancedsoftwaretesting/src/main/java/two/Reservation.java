package two;

public class Reservation {

    private User madeBy;

    public Reservation() {

    }

    public Reservation(User madeBy) {
        this.madeBy = madeBy;
    }

    public User getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(User madeBy) {
        this.madeBy = madeBy;
    }

    public boolean canBeCancelledBY(User user) {

        if (user.getIsAdmin()) {
            return true;
        }

        if (madeBy == user) {
            return true;
        }
        return false;
    }

}
