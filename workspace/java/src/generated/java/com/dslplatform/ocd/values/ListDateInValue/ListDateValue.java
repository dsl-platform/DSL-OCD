package com.dslplatform.ocd.values.ListDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class ListDateValue implements java.io.Serializable {
    public ListDateValue(
            final java.util.List<org.joda.time.LocalDate> listDate) {
        setListDate(listDate);
    }

    public ListDateValue() {
        this.listDate = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 675322531;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ListDateValue)) return false;
        final ListDateValue other = (ListDateValue) obj;

        if (!(this.listDate.equals(other.listDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "ListDateValue(" + listDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> listDate;

    @JsonProperty("listDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getListDate() {
        return listDate;
    }

    public ListDateValue setListDate(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"listDate\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.listDate = value;

        return this;
    }
}
