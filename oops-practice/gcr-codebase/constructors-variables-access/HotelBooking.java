public class HotelBooking {

    private String gnm;
    private String rt;
    private int n;

    public HotelBooking() {
        this("NA", "NA", 0);
    }

    public HotelBooking(String gnm, String rt, int n) {
        this.gnm = gnm;
        this.rt = rt;
        this.n = n;
    }

    // Copy constructor
    public HotelBooking(HotelBooking hb) {
        this.gnm = hb.gnm;
        this.rt = hb.rt;
        this.n = hb.n;
    }
}

