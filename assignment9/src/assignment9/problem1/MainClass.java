package assignment9.problem1;

import java.time.LocalDate;

public class MainClass {

    public static void main(String[] args) {
        Member[] members = {
                new Member(),
                new Member("John", LocalDate.now(), LocalDate.of(2017, 10, 30), 1234.50),
                new Member("Jane", LocalDate.of(2013, 1, 1), LocalDate.of(2017, 10, 30), 1234.50),
        };

        for (Member member : members)
            System.out.println(member + "\n");

        System.out.println("\n\n\nTest search method");

        for (Member member : members)
            System.out.println(member.search("Jane"));

        System.out.println("\n\n\nTest update price");
        members[2].updatePrice(100.00);
        System.out.println(members[2]);
    }
}
