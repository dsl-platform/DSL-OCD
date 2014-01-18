package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDates_1 implements java.io.Serializable {
    public NullableListOfOneDates_1(
            final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates) {
        setNullableListOfOneDates(nullableListOfOneDates);
    }

    public NullableListOfOneDates_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1854470665;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDates_1)) return false;
        final NullableListOfOneDates_1 other = (NullableListOfOneDates_1) obj;

        if (!(this.nullableListOfOneDates == other.nullableListOfOneDates || this.nullableListOfOneDates != null
                && this.nullableListOfOneDates
                        .equals(other.nullableListOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDates_1(" + nullableListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfOneDates;

    @JsonProperty("nullableListOfOneDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfOneDates() {
        return nullableListOfOneDates;
    }

    public NullableListOfOneDates_1 setNullableListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDates = value;

        return this;
    }
}
