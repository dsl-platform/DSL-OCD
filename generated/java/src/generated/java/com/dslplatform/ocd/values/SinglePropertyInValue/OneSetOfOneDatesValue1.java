package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneDatesValue1 implements java.io.Serializable {
    public OneSetOfOneDatesValue1(
            final java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates) {
        setOneSetOfOneDates(oneSetOfOneDates);
    }

    public OneSetOfOneDatesValue1() {
        this.oneSetOfOneDates = new java.util.HashSet<org.joda.time.LocalDate>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1612978370;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneDatesValue1)) return false;
        final OneSetOfOneDatesValue1 other = (OneSetOfOneDatesValue1) obj;

        if (!(this.oneSetOfOneDates.equals(other.oneSetOfOneDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneDatesValue1(" + oneSetOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> oneSetOfOneDates;

    @JsonProperty("oneSetOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.LocalDate> getOneSetOfOneDates() {
        return oneSetOfOneDates;
    }

    public OneSetOfOneDatesValue1 setOneSetOfOneDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneDates\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneDates = value;

        return this;
    }
}
