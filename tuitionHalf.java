public class J105_4 {
    public static void main(String[] args) {
        double PrincipalTuition = 100000;
        double FivePercent = 0.05;
        int month = 0;
        int year = 0;
        int MonthsTotal = 0;

        while (PrincipalTuition > 50000) {
            PrincipalTuition = PrincipalTuition * (1 - FivePercent);
            month++;
            MonthsTotal++;

            if (month == 12) {
                year++;
                month = 0; // Reset months after a year
            }
        }
