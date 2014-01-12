package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneDatesValue3 implements java.io.Serializable {
    public NullableSetOfOneDatesValue3(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfOneDates) {
        setNullableSetOfOneDates(nullableSetOfOneDates);
    }

    public NullableSetOfOneDatesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 754357823;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneDatesValue3)) return false;
        final NullableSetOfOneDatesValue3 other = (NullableSetOfOneDatesValue3) obj;

        if (!(this.nullableSetOfOneDates == other.nullableSetOfOneDates || this.nullableSetOfOneDates != null
                && this.nullableSetOfOneDates
                        .equals(other.nullableSetOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneDatesValue3(" + nullableSetOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfOneDates;

    @JsonProperty("nullableSetOfOneDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfOneDates() {
        return nullableSetOfOneDates;
    }

    public NullableSetOfOneDatesValue3 setNullableSetOfOneDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneDates = value;

        return this;
    }
}
