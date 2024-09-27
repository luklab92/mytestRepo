package org.example.faa;

import java.time.LocalDate;

public class AirOperator {
    private final String name;
    private final LocalDate certIssueDate;
    private final int countPIC;
    private final int countOtherPilots;
    private final int countFlightAttendants;
    private final int countEmployees;

    public AirOperator(String name, LocalDate certIssueDate, int countPIC, int countOtherPilots, int countFlightAttendants, int countEmployees) {
        this.name = name;
        this.certIssueDate = certIssueDate;
        this.countPIC = countPIC;
        this.countOtherPilots = countOtherPilots;
        this.countFlightAttendants = countFlightAttendants;
        this.countEmployees = countEmployees;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCertIssueDate() {
        return certIssueDate;
    }

    public int getCountPIC() {
        return countPIC;
    }

    public int getCountOtherPilots() {
        return countOtherPilots;
    }

    public int getCountFlightAttendants() {
        return countFlightAttendants;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    @Override
    public String toString() {
        return "AirOperator{" +
                "name='" + name + '\'' +
                ", certIssueDate=" + certIssueDate +
                ", countPIC=" + countPIC +
                ", countOtherPilots=" + countOtherPilots +
                ", countFlightAttendants=" + countFlightAttendants +
                ", countEmployees=" + countEmployees +
                '}';
    }
}
