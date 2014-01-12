package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDatesValue2 implements
        java.io.Serializable {
    public NullableListOfNullableDatesValue2(
            final java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates) {
        setNullableListOfNullableDates(nullableListOfNullableDates);
    }

    public NullableListOfNullableDatesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1688345271;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDatesValue2)) return false;
        final NullableListOfNullableDatesValue2 other = (NullableListOfNullableDatesValue2) obj;

        if (!(this.nullableListOfNullableDates == other.nullableListOfNullableDates || this.nullableListOfNullableDates != null
                && this.nullableListOfNullableDates
                        .equals(other.nullableListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDatesValue2("
                + nullableListOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates;

    @JsonProperty("nullableListOfNullableDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfNullableDates() {
        return nullableListOfNullableDates;
    }

    public NullableListOfNullableDatesValue2 setNullableListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        this.nullableListOfNullableDates = value;

        return this;
    }
}
