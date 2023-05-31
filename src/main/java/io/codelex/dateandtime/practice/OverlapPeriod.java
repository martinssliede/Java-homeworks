package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class OverlapPeriod {
    private LocalDate start;
    private LocalDate end;

    public OverlapPeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public OverlapPeriod intersection(OverlapPeriod otherPeriod) {
        LocalDate intersectionStart = this.start.isAfter(otherPeriod.getStart()) ? this.start : otherPeriod.getStart();
        LocalDate intersectionEnd = this.end.isBefore(otherPeriod.getEnd()) ? this.end : otherPeriod.getEnd();

        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        }
        return new OverlapPeriod(intersectionStart, intersectionEnd);
    }
}
