package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDates_1 implements
        java.io.Serializable {
    public NullableArrayOfNullableDates_1(
            final org.joda.time.LocalDate[] nullableArrayOfNullableDates) {
        setNullableArrayOfNullableDates(nullableArrayOfNullableDates);
    }

    public NullableArrayOfNullableDates_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 765921669;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDates_1)) return false;
        final NullableArrayOfNullableDates_1 other = (NullableArrayOfNullableDates_1) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDates,
                other.nullableArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDates_1(" + nullableArrayOfNullableDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfNullableDates;

    @JsonProperty("nullableArrayOfNullableDates")
    public org.joda.time.LocalDate[] getNullableArrayOfNullableDates() {
        return nullableArrayOfNullableDates;
    }

    public NullableArrayOfNullableDates_1 setNullableArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        this.nullableArrayOfNullableDates = value;

        return this;
    }
}
