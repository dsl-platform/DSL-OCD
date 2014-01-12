package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDatesValue1 implements
        java.io.Serializable {
    public NullableSetOfNullableDatesValue1(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates) {
        setNullableSetOfNullableDates(nullableSetOfNullableDates);
    }

    public NullableSetOfNullableDatesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 557720858;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDatesValue1)) return false;
        final NullableSetOfNullableDatesValue1 other = (NullableSetOfNullableDatesValue1) obj;

        if (!(this.nullableSetOfNullableDates == other.nullableSetOfNullableDates || this.nullableSetOfNullableDates != null
                && this.nullableSetOfNullableDates
                        .equals(other.nullableSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDatesValue1(" + nullableSetOfNullableDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates;

    @JsonProperty("nullableSetOfNullableDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfNullableDates() {
        return nullableSetOfNullableDates;
    }

    public NullableSetOfNullableDatesValue1 setNullableSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        this.nullableSetOfNullableDates = value;

        return this;
    }
}
