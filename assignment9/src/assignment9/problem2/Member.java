package assignment9.problem2;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Member implements IMember {

    private String name;
    private LocalDate membershipDateStart;
    private LocalDate membershipDateEnd;
    private double membershipPrice;
    private  Address address;

    public Member() {
        name = "unknown";
        membershipDateStart = LocalDate.now();
        membershipDateEnd = LocalDate.now();
        address = new Address();
    }

    public Member(String name, LocalDate membershipDateStart,
           LocalDate membershipDateEnd, double membershipPrice) {
        this.name = name;
        this.membershipDateStart = membershipDateStart;
        this.membershipDateEnd = membershipDateEnd;
        this.membershipPrice = membershipPrice;
        address = new Address();
    }

    public Member(String name, LocalDate membershipDateStart, LocalDate membershipDateEnd,
           double membershipPrice, String street, int house, String city, int postalCode) {
        this.name = name;
        this.membershipDateStart = membershipDateStart;
        this.membershipDateEnd = membershipDateEnd;
        this.membershipPrice = membershipPrice;
        this.address = new Address(street, house, city, postalCode);

    }

    public void updatePrice(double membershipPrice) {
        this.membershipPrice = membershipPrice;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\naddress: " + address +
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

    private class Address {
        private String streetName, city;
        private int houseNumber, postalCode;

        Address() {
            streetName = "unknown";
            city = "unknown";
        }

        Address(String streetName, int houseNumber, String city, int postalCode) {
            this.streetName = streetName;
            this.houseNumber = houseNumber;
            this.city = city;
            this.postalCode = postalCode;
        }

        @Override
        public String toString() {
            return streetName + " " + houseNumber + " " + city + " " + postalCode;
        }
    }
}
