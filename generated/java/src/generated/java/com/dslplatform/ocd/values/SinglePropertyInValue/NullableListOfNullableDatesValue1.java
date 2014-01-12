package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDatesValue1 implements
        java.io.Serializable {
    public NullableListOfNullableDatesValue1(
            final java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates) {
        setNullableListOfNullableDates(nullableListOfNullableDates);
    }

    public NullableListOfNullableDatesValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1688345268;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDatesValue1)) return false;
        final NullableListOfNullableDatesValue1 other = (NullableListOfNullableDatesValue1) obj;

        if (!(this.nullableListOfNullableDates == other.nullableListOfNullableDates || this.nullableListOfNullableDates != null
                && this.nullableListOfNullableDates
                        .equals(other.nullableListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDatesValue1("
                + nullableListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates;

    @JsonProperty("nullableListOfNullableDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfNullableDates() {
        return nullableListOfNullableDates;
    }

    public NullableListOfNullableDatesValue1 setNullableListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        this.nullableListOfNullableDates = value;

        return this;
    }
}
