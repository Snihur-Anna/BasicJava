package edu.ntudp.sau.snihur.lab4.model;

import java.util.Objects;

public abstract class AbstractUnit implements UniversityUnit {
    private String name;
    private Human head;

    protected AbstractUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return name + " (head: " + head + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractUnit)) return false;
        AbstractUnit unit = (AbstractUnit) o;
        return Objects.equals(name, unit.name)
                && Objects.equals(head, unit.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}
