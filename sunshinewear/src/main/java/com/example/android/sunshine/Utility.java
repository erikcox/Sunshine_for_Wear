package com.example.android.sunshine;

import android.content.res.Resources;
import android.support.annotation.NonNull;

import java.util.Calendar;

public class Utility {
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

    @NonNull
    public static String getMonthOfYearString(Resources resources, int monthOfYear) {
        int monthOfYearString;
        switch(monthOfYear) {
            case Calendar.JANUARY:
                monthOfYearString = R.string.month0;
                break;
            case Calendar.FEBRUARY:
                monthOfYearString = R.string.month1;
                break;
            case Calendar.MARCH:
                monthOfYearString = R.string.month2;
                break;
            case Calendar.APRIL:
                monthOfYearString = R.string.month3;
                break;
            case Calendar.MAY:
                monthOfYearString = R.string.month4;
                break;
            case Calendar.JUNE:
                monthOfYearString = R.string.month5;
                break;
            case Calendar.JULY:
                monthOfYearString = R.string.month6;
                break;
            case Calendar.AUGUST:
                monthOfYearString = R.string.month7;
                break;
            case Calendar.SEPTEMBER:
                monthOfYearString = R.string.month8;
                break;
            case Calendar.OCTOBER:
                monthOfYearString = R.string.month9;
                break;
            case Calendar.NOVEMBER:
                monthOfYearString = R.string.month10;
                break;
            case Calendar.DECEMBER:
                monthOfYearString = R.string.month11;
                break;
            default:
                monthOfYearString = -1;
        }

        if (monthOfYearString != -1) {
            return resources.getString(monthOfYearString);
        }

        return "";
    }

    @NonNull
    public static String getDayOfWeekString(Resources resources, int day) {
        int dayOfWeekString;
        switch (day) {
            case Calendar.SUNDAY:
                dayOfWeekString = R.string.day0;
                break;
            case Calendar.MONDAY:
                dayOfWeekString = R.string.day1;
                break;
            case Calendar.TUESDAY:
                dayOfWeekString = R.string.day2;
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekString = R.string.day3;
                break;
            case Calendar.THURSDAY:
                dayOfWeekString = R.string.day4;
                break;
            case Calendar.FRIDAY:
                dayOfWeekString = R.string.day5;
                break;
            case Calendar.SATURDAY:
                dayOfWeekString = R.string.day6;
                break;
            default:
                dayOfWeekString = -1;
        }

        if (dayOfWeekString != -1) {
            return resources.getString(dayOfWeekString);
        }

        return "";
    }

    public static String getAmPmString(Resources resources, int am_pm) {
        return am_pm == Calendar.AM ?
                resources.getString(R.string.am) : resources.getString(R.string.pm);
    }
}