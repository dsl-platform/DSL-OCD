package com.dslplatform.ocd.values.ListOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListOptDateValue implements java.io.Serializable {
    public ListOptDateValue(
            final java.util.List<org.joda.time.LocalDate> listOptDate) {
        setListOptDate(listOptDate);
    }

    public ListOptDateValue() {
        this.listOptDate = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1311864684;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListOptDateValue)) return false;
        final ListOptDateValue other = (ListOptDateValue) obj;

        if (!(this.listOptDate.equals(other.listOptDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListOptDateValue(" + listOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> listOptDate;

    @JsonProperty("listOptDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getListOptDate() {
        return listOptDate;
    }

    public ListOptDateValue setListOptDate(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listOptDate\" cannot be null!");
        this.listOptDate = value;

        return this;
    }
}
