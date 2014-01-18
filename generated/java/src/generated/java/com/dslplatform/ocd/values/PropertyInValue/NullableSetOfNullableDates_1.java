package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDates_1 implements java.io.Serializable {
    public NullableSetOfNullableDates_1(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates) {
        setNullableSetOfNullableDates(nullableSetOfNullableDates);
    }

    public NullableSetOfNullableDates_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 253584950;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDates_1)) return false;
        final NullableSetOfNullableDates_1 other = (NullableSetOfNullableDates_1) obj;

        if (!(this.nullableSetOfNullableDates == other.nullableSetOfNullableDates || this.nullableSetOfNullableDates != null
                && this.nullableSetOfNullableDates
                        .equals(other.nullableSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDates_1(" + nullableSetOfNullableDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates;

    @JsonProperty("nullableSetOfNullableDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfNullableDates() {
        return nullableSetOfNullableDates;
    }

    public NullableSetOfNullableDates_1 setNullableSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        this.nullableSetOfNullableDates = value;

        return this;
    }
}
