package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneDatesValue1 implements java.io.Serializable {
    public OneListOfOneDatesValue1(
            final java.util.List<org.joda.time.LocalDate> oneListOfOneDates) {
        setOneListOfOneDates(oneListOfOneDates);
    }

    public OneListOfOneDatesValue1() {
        this.oneListOfOneDates = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1005749202;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneDatesValue1)) return false;
        final OneListOfOneDatesValue1 other = (OneListOfOneDatesValue1) obj;

        if (!(this.oneListOfOneDates.equals(other.oneListOfOneDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneDatesValue1(" + oneListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> oneListOfOneDates;

    @JsonProperty("oneListOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getOneListOfOneDates() {
        return oneListOfOneDates;
    }

    public OneListOfOneDatesValue1 setOneListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneDates\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneDates = value;

        return this;
    }
}
