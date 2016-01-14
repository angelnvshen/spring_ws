package spring.ws.model;

/**
 * Created by bf50 on 2016/1/14.
 */
public class HolidayRequest {
    private Employee employee;
    private Holiday holiday;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }
}
