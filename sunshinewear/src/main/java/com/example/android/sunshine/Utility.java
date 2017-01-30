package rocks.ecox.sunshinewear;

import java.util.Date;
import java.text.DateFormat;

public class Utility {

    static String formatDate(long dateInMilliseconds) {
        Date date = new Date(dateInMilliseconds);
        return DateFormat.getDateInstance().format(date);
    }

    public static int getIconResourceForWeatherCondition(int weatherId) {
        if (weatherId >= 200 && weatherId <= 232) {
            return R.drawable.ic_storm;
        } else if (weatherId >= 300 && weatherId <= 321) {
            return R.drawable.ic_light_rain;
        } else if (weatherId >= 500 && weatherId <= 504) {
            return R.drawable.ic_rain;
        } else if (weatherId == 511) {
            return R.drawable.ic_snow;
        } else if (weatherId >= 520 && weatherId <= 531) {
            return R.drawable.ic_rain;
        } else if (weatherId >= 600 && weatherId <= 622) {
            return R.drawable.ic_snow;
        } else if (weatherId >= 701 && weatherId <= 761) {
            return R.drawable.ic_fog;
        } else if (weatherId == 761 || weatherId == 781) {
            return R.drawable.ic_storm;
        } else if (weatherId == 800) {
            return R.drawable.ic_clear;
        } else if (weatherId == 801) {
            return R.drawable.ic_light_clouds;
        } else if (weatherId >= 802 && weatherId <= 804) {
            return R.drawable.ic_cloudy;
        }
        return -1;
    }

    public static int getArtResourceForWeatherCondition(int weatherId) {
        if (weatherId >= 200 && weatherId <= 232) {
            return R.drawable.art_storm;
        } else if (weatherId >= 300 && weatherId <= 321) {
            return R.drawable.art_light_rain;
        } else if (weatherId >= 500 && weatherId <= 504) {
            return R.drawable.art_rain;
        } else if (weatherId == 511) {
            return R.drawable.art_snow;
        } else if (weatherId >= 520 && weatherId <= 531) {
            return R.drawable.art_rain;
        } else if (weatherId >= 600 && weatherId <= 622) {
            return R.drawable.art_snow;
        } else if (weatherId >= 701 && weatherId <= 761) {
            return R.drawable.art_fog;
        } else if (weatherId == 761 || weatherId == 781) {
            return R.drawable.art_storm;
        } else if (weatherId == 800) {
            return R.drawable.art_clear;
        } else if (weatherId == 801) {
            return R.drawable.art_light_clouds;
        } else if (weatherId >= 802 && weatherId <= 804) {
            return R.drawable.art_clouds;
        }
        return -1;
    }

    public static Integer getDay(int day) {
        Integer dayString;
        switch (day) {
            case 0:
                dayString = R.string.day0;
                break;
            case 1:
                dayString = R.string.day1;
                break;
            case 2:
                dayString = R.string.day2;
                break;
            case 3:
                dayString = R.string.day3;
                break;
            case 4:
                dayString = R.string.day4;
                break;
            case 5:
                dayString = R.string.day5;
                break;
            case 6:
                dayString = R.string.day6;
                break;
            default:
                dayString = null;
        }
        return dayString;
    }

    public static Integer getMonth(int month) {
        Integer monthString;
        switch (month) {
            case 0:
                monthString = R.string.month0;
                break;
            case 1:
                monthString = R.string.month1;
                break;
            case 2:
                monthString = R.string.month2;
                break;
            case 3:
                monthString = R.string.month3;
                break;
            case 4:
                monthString = R.string.month4;
                break;
            case 5:
                monthString = R.string.month5;
                break;
            case 6:
                monthString = R.string.month6;
                break;
            case 7:
                monthString = R.string.month7;
                break;
            case 8:
                monthString = R.string.month8;
                break;
            case 9:
                monthString = R.string.month9;
                break;
            case 10:
                monthString = R.string.month10;
                break;
            case 11:
                monthString = R.string.month11;
                break;
            default:
                monthString=null;
        }
        return monthString;
    }
}