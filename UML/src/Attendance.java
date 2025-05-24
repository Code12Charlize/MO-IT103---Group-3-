public class Attendance {

    // Please note that all details are only examples

    public float totalAttendance() {

        int attendanceDays = 22; // Example: 22 days present
        int cutoffDays = 26; // Example: 26 working days in cutoff
        int hourlyRate = 100; // Example: P100/hour
        int workingHoursPerDay = 8; // Example: 8-hour workday

        // Calculate total pay
        float totalPay = attendanceDays * workingHoursPerDay * hourlyRate;

        // Optional: Calculate attendance percentage
        float attendancePercentage = ((float) attendanceDays / cutoffDays) * 100;

        System.out.println("Attendance: " + attendanceDays + "/" + cutoffDays +
                " (" + String.format("%.1f", attendancePercentage) + "%)");

        return totalPay; // Returns 8800.0f in this example

    }

}
