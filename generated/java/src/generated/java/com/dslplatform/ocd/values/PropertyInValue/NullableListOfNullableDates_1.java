package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfNullableDates_1 implements
        java.io.Serializable {
    public NullableListOfNullableDates_1(
            final java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates) {
        setNullableListOfNullableDates(nullableListOfNullableDates);
    }

    public NullableListOfNullableDates_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 458296864;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfNullableDates_1)) return false;
        final NullableListOfNullableDates_1 other = (NullableListOfNullableDates_1) obj;

        if (!(this.nullableListOfNullableDates == other.nullableListOfNullableDates || this.nullableListOfNullableDates != null
                && this.nullableListOfNullableDates
                        .equals(other.nullableListOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfNullableDates_1(" + nullableListOfNullableDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfNullableDates;

    @JsonProperty("nullableListOfNullableDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfNullableDates() {
        return nullableListOfNullableDates;
    }

    public NullableListOfNullableDates_1 setNullableListOfNullableDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        this.nullableListOfNullableDates = value;

        return this;
    }
}
