public class FindDay {
    /**
     * Bài toán nhập vào ngày tháng năm, xác định ngày đó là thứ mấy?
     *
     * Năm nhuận (Leap Year) tính theo lịch Gregorian (từ năm 1582): năm phải chia hết cho 4 và không chia hết cho 100, hoặc năm phải chia hết cho 400.
     * Thứ trong tuần được tính theo công thức Zeller:
     * dayOfWeek = (d+y+y/4-y/100+y/400+(31*m)/12)%7. Trong đó:
     * a = (14 – month)/12
     * y = year – a
     * m = month + 12*a -2
     * DayOfWeek: 0 (Chủ nhật), 1 (Thứ hai), 2 (Thứ ba), …*/
    static String findDay(int d,int m,int y){
        if (m<1||m>12) return "Invalid input";
        if (y<1582) return "Invalid input";
        int dayMax;
        switch(m)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                dayMax=30;
                break;
            case 2:
                if ((y%4==0 && y%100!=0) || y%400==0) dayMax = 29;
                else dayMax = 28;
                break;
            default:
                dayMax=31;
        }
        if (d<1||d>dayMax) return "Invalid input";
        y -= (14-m)/12;
        m += 12*((14-m)/12)-2;
        int dayOfWeek = (d + y + y/4 - y/100 + y/400 + (31*m)/12)%7;
        if (dayOfWeek==0) return "Chu nhat";
        else return "Thu "+(dayOfWeek+1);
    }
}
