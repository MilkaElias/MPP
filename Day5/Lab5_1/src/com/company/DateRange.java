package com.company;

import java.time.LocalDate;


public class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isInRange(LocalDate date) {
        return date.isBefore(endDate) && date.isAfter(startDate);
    }

    public static LocalDate getFirstDayOfMonth(LocalDate date) {
        return LocalDate.of(date.getYear(), date.getMonth(), 1);
    }

    public static LocalDate getLastDayOfMonth(LocalDate date) {
        return LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());

    }

    @Override
    public String toString() {
        return "DateRange{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
