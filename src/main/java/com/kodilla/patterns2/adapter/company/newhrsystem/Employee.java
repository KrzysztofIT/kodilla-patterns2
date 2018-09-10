package com.kodilla.patterns2.adapter.company.newhrsystem;

import javax.jnlp.PersistenceService;
import java.awt.event.PaintEvent;
import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    final private String peselId;
    final private String firstName;
    final private String secondName;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String firstName, String secondName, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getPeselId(), employee.getPeselId()) &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getSecondName(), employee.getSecondName()) &&
                Objects.equals(getBaseSalary(), employee.getBaseSalary());
    }

    @Override
    public int hashCode() {
        return peselId != null ? peselId.hashCode() : 0;
    }
}
