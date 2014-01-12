package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableDatesValue3 implements
        java.io.Serializable {
    public NullableArrayOfNullableDatesValue3(
            final org.joda.time.LocalDate[] nullableArrayOfNullableDates) {
        setNullableArrayOfNullableDates(nullableArrayOfNullableDates);
    }

    public NullableArrayOfNullableDatesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1753924191;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableDatesValue3)) return false;
        final NullableArrayOfNullableDatesValue3 other = (NullableArrayOfNullableDatesValue3) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableDates,
                other.nullableArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableDatesValue3("
                + nullableArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfNullableDates;

    @JsonProperty("nullableArrayOfNullableDates")
    public org.joda.time.LocalDate[] getNullableArrayOfNullableDates() {
        return nullableArrayOfNullableDates;
    }

    public NullableArrayOfNullableDatesValue3 setNullableArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        this.nullableArrayOfNullableDates = value;

        return this;
    }
}
