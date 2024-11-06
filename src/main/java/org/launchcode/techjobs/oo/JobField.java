package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    int id;
    String value;
    static int nextId;

    public JobField (){
        id = nextId;
        nextId++;
    }

    public JobField(String aValue){
        this();
        this.value = aValue;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}


