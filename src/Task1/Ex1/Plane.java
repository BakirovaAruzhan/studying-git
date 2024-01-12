package Task1.Ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Plane {
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

    public static class Main {
        public static void main(String[] args) {
            Plane[] planes = new Plane[]{
                    new Plane("ABC", "12:05", "12:45"),
                    new Plane("FDR", "12:00", "12:30"),
                    new Plane("DWE", "15:20", "18:40"),
                    new Plane("OYH", "12:00", "12:10"),
                    new Plane("LQW", "15:20", "17:50"),
                    new Plane("BDF", "12:15", "15:43"),
                    new Plane("TNE", "15:41", "16:00")
            };

            Plane[] filteredPlanes = filterPlanes(planes);

            for (Plane plane : filteredPlanes) {
                System.out.println(plane.getId() + " " + plane.getArrivalTime() + " " + plane.getLeaveTime());
            }
        }

        private static Plane[] filterPlanes(Plane[] planeArray) {
            int count = 0;
            for (Plane plane : planeArray) {
                if (plane.getFlightDuration() > 2) {
                    count++;
                }
            }

            Plane[] result = new Plane[count];
            int index = 0;
            for (Plane plane : planeArray) {
                if (plane.getFlightDuration() > 2) {
                    result[index++] = plane;
                }
            }

            return result;
        }
    }
}



