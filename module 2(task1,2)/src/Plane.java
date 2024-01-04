import java.text.ParseException;
import java.text.SimpleDateFormat;

class Plane {
    private String id;
    private String arrivalTime;
    private String leaveTime;

    public Plane(String id, String arrivalTime, String leaveTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.leaveTime = leaveTime;
    }

    public String getId() {
        return id;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public int getFlightDuration() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        try {
            long arrivalMillis = dateFormat.parse(arrivalTime).getTime();
            long leaveMillis = dateFormat.parse(leaveTime).getTime();
            long durationMillis = leaveMillis - arrivalMillis;
            return (int) (durationMillis / (60 * 60 * 1000));
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

