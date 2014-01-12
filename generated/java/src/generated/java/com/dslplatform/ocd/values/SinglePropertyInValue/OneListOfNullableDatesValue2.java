package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDatesValue2 implements java.io.Serializable {
    public OneListOfNullableDatesValue2(
            final java.util.List<org.joda.time.LocalDate> oneListOfNullableDates) {
        setOneListOfNullableDates(oneListOfNullableDates);
    }

    public OneListOfNullableDatesValue2() {
        this.oneListOfNullableDates = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 306022662;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDatesValue2)) return false;
        final OneListOfNullableDatesValue2 other = (OneListOfNullableDatesValue2) obj;

        if (!(this.oneListOfNullableDates.equals(other.oneListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDatesValue2(" + oneListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> oneListOfNullableDates;

    @JsonProperty("oneListOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getOneListOfNullableDates() {
        return oneListOfNullableDates;
    }

    public OneListOfNullableDatesValue2 setOneListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDates\" cannot be null!");
        this.oneListOfNullableDates = value;

        return this;
    }
}
