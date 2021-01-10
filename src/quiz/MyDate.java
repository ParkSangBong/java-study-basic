package quiz;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){

        this.day = day;
        this.month = month;
        this.year = year;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof MyDate){
            MyDate myDate = (MyDate)obj;
            return (this.day == myDate.day) && (this.month == myDate.month) && (this.year == myDate.year);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return month * year / day;
    }
}