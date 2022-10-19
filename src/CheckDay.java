public class CheckDay {

    static boolean checkDay(int day, int month, int year) {
        if (month > 12 || month < 1) return false;
        if (day < 0||day>31) return false;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day > 31) return true;
                break;
            case 4, 6, 9, 11:
                if (day > 30) return false;
                break;
            default:
                if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
                    if (day>29) return false;
                } else if (day>28) return false;
        }
        return true;
    }
}
