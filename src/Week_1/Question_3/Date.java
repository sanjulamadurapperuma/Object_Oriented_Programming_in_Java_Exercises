package Week_1.Question_3;

public class Date {
    private int day;
    private int month;
    private int year;
    private String formattedDay;
    private String formattedMonth;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setDate(int day, int month, int year ){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate(){
        if (day < 10){
            formattedDay = String.format("%02d", day);
        } else{
            formattedDay = Integer.toString(getDay());
        }

        if (month < 10) {
            formattedMonth = String.format("%02d", month);
        } else{
            formattedMonth = Integer.toString(getMonth());
        }
        return formattedDay + "/" + formattedMonth + "/" + getYear();
    }

    @Override
    public String toString() {
        return getDate();
    }
}
