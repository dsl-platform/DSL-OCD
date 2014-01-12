package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneDatesValue3 implements java.io.Serializable {
    public NullableListOfOneDatesValue3(
            final java.util.List<org.joda.time.LocalDate> nullableListOfOneDates) {
        setNullableListOfOneDates(nullableListOfOneDates);
    }

    public NullableListOfOneDatesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 830318915;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneDatesValue3)) return false;
        final NullableListOfOneDatesValue3 other = (NullableListOfOneDatesValue3) obj;

        if (!(this.nullableListOfOneDates == other.nullableListOfOneDates || this.nullableListOfOneDates != null
                && this.nullableListOfOneDates
                        .equals(other.nullableListOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneDatesValue3(" + nullableListOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.joda.time.LocalDate> nullableListOfOneDates;

    @JsonProperty("nullableListOfOneDates")
    public java.util.List<org.joda.time.LocalDate> getNullableListOfOneDates() {
        return nullableListOfOneDates;
    }

    public NullableListOfOneDatesValue3 setNullableListOfOneDates(
            final java.util.List<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneDates = value;

        return this;
    }
}
