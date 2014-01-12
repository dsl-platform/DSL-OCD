package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDatesValue5 implements
        java.io.Serializable {
    public NullableArrayOfNullableDatesValue5(
            final org.joda.time.LocalDate[] nullableArrayOfNullableDates) {
        setNullableArrayOfNullableDates(nullableArrayOfNullableDates);
    }

    public NullableArrayOfNullableDatesValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1378243691;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDatesValue5)) return false;
        final NullableArrayOfNullableDatesValue5 other = (NullableArrayOfNullableDatesValue5) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDates,
                other.nullableArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDatesValue5("
                + nullableArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfNullableDates;

    @JsonProperty("nullableArrayOfNullableDates")
    public org.joda.time.LocalDate[] getNullableArrayOfNullableDates() {
        return nullableArrayOfNullableDates;
    }

    public NullableArrayOfNullableDatesValue5 setNullableArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        this.nullableArrayOfNullableDates = value;

        return this;
    }
}
