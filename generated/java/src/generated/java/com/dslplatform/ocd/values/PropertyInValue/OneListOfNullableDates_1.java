package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDates_1 implements java.io.Serializable {
    public OneListOfNullableDates_1(
            final java.util.List<org.joda.time.LocalDate> oneListOfNullableDates) {
        setOneListOfNullableDates(oneListOfNullableDates);
    }

    public OneListOfNullableDates_1() {
        this.oneListOfNullableDates = new java.util.ArrayList<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1138073265;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDates_1)) return false;
        final OneListOfNullableDates_1 other = (OneListOfNullableDates_1) obj;

        if (!(this.oneListOfNullableDates.equals(other.oneListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDates_1(" + oneListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> oneListOfNullableDates;

    @JsonProperty("oneListOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<org.joda.time.LocalDate> getOneListOfNullableDates() {
        return oneListOfNullableDates;
    }

    public OneListOfNullableDates_1 setOneListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDates\" cannot be null!");
        this.oneListOfNullableDates = value;

        return this;
    }
}
