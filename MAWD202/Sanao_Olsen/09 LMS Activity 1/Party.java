package party;

class Party {
    private int numGuests;

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int num) {
        numGuests = num;
    }

    public void showInvitation() {
        System.out.println("Please come to my party!");
    }
}
