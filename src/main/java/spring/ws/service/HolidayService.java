package spring.ws.service;

import java.util.Date;

/**
 * Created by bf50 on 2016/1/14.
 */
public class HolidayService {
    public void bookHoliday(Date startDate, Date endDate, String name) {
        System.out.println("Booking holiday for [" + startDate + "-" + endDate + "] for [" + name + "] ");
    }
}
