package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableDates_1 implements java.io.Serializable {
    public OneSetOfNullableDates_1(
            final java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates) {
        setOneSetOfNullableDates(oneSetOfNullableDates);
    }

    public OneSetOfNullableDates_1() {
        this.oneSetOfNullableDates = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 625882845;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableDates_1)) return false;
        final OneSetOfNullableDates_1 other = (OneSetOfNullableDates_1) obj;

        if (!(this.oneSetOfNullableDates.equals(other.oneSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableDates_1(" + oneSetOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> oneSetOfNullableDates;

    @JsonProperty("oneSetOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getOneSetOfNullableDates() {
        return oneSetOfNullableDates;
    }

    public OneSetOfNullableDates_1 setOneSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableDates\" cannot be null!");
        this.oneSetOfNullableDates = value;

        return this;
    }
}
