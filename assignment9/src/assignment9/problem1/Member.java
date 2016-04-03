package assignment9.problem1;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Member implements IMember{

    private String name;
    private LocalDate membershipDateStart;
    private LocalDate membershipDateEnd;
    private double membershipPrice;

    Member() {
        name = "unknown";
        membershipDateStart = LocalDate.now();
        membershipDateEnd = LocalDate.now();
    }

    Member(String name, LocalDate membershipDateStart,
           LocalDate membershipDateEnd, double membershipPrice) {
        this.name = name;
        this.membershipDateStart = membershipDateStart;
        this.membershipDateEnd = membershipDateEnd;
        this.membershipPrice = membershipPrice;
    }

    public void updatePrice(double membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nmembership starts: " + membershipDateStart +
                "\nmembership ends: " + membershipDateEnd +
                "\nmembership duration: " + membershipDuration() +
                "\nmembership price: " + membershipPrice;
    }

    @Override
    public String search(String name) {
        if (this.name.equals(name))
            return toString();

        return "doesn't match";
    }

    @Override
    public long membershipDuration() {
        return DAYS.between(membershipDateStart, membershipDateEnd);
    }
}
