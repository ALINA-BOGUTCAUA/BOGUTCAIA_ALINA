package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public static void  displayDate (int day, int month, int year){
        System.out.println("Date is: " + day + "/" + month + "/" +year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 31 || day < 1){
            System.out.println("The day is incorrect!!!");
        } else {this.day = day;}
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month > 12 || month < 1){
            System.out.println("Month is incorrect!!!");
        }else {this.month = month;}
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2024 || year < 0){
            System.out.println("Year is incorrect!!!");
        }else {this.year = year;
        }
    }
}
