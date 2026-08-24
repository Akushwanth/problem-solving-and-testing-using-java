import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        // Convert to proper format: capitalize first letter, rest lowercase
        String dayOfWeek = date.getDayOfWeek().toString().toLowerCase();
        return dayOfWeek.substring(0,1).toUpperCase() + dayOfWeek.substring(1);
    }
}
