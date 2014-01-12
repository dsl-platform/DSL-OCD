package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDatesValue2 implements java.io.Serializable {
    public NullableListOfOneDatesValue2(
            final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates) {
        setNullableListOfOneDates(nullableListOfOneDates);
    }

    public NullableListOfOneDatesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 735765026;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDatesValue2)) return false;
        final NullableListOfOneDatesValue2 other = (NullableListOfOneDatesValue2) obj;

        if (!(this.nullableListOfOneDates == other.nullableListOfOneDates || this.nullableListOfOneDates != null
                && this.nullableListOfOneDates
                        .equals(other.nullableListOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDatesValue2(" + nullableListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfOneDates;

    @JsonProperty("nullableListOfOneDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfOneDates() {
        return nullableListOfOneDates;
    }

    public NullableListOfOneDatesValue2 setNullableListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDates = value;

        return this;
    }
}
