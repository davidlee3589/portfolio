import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TotalCalories {
    private int caloriesPerDay;
    private Date startDate;
    private Date endDate;

    public TotalCalories(int caloriesPerDay, String startDateStr, String endDateStr) throws ParseException {
        this.caloriesPerDay = caloriesPerDay;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        this.startDate = sdf.parse(startDateStr);
        this.endDate = sdf.parse(endDateStr);
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            totalCalories += caloriesPerDay;
            calendar.add(Calendar.DATE, 1);
        }
        return totalCalories;
    }
}
