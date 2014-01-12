package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableDatesValue3 implements
        java.io.Serializable {
    public NullableSetOfNullableDatesValue3(
            final java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates) {
        setNullableSetOfNullableDates(nullableSetOfNullableDates);
    }

    public NullableSetOfNullableDatesValue3() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1720520272;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableDatesValue3)) return false;
        final NullableSetOfNullableDatesValue3 other = (NullableSetOfNullableDatesValue3) obj;

        if (!(this.nullableSetOfNullableDates == other.nullableSetOfNullableDates || this.nullableSetOfNullableDates != null
                && this.nullableSetOfNullableDates
                        .equals(other.nullableSetOfNullableDates)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableDatesValue3(" + nullableSetOfNullableDates
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.LocalDate> nullableSetOfNullableDates;

    @JsonProperty("nullableSetOfNullableDates")
    public java.util.Set<org.joda.time.LocalDate> getNullableSetOfNullableDates() {
        return nullableSetOfNullableDates;
    }

    public NullableSetOfNullableDatesValue3 setNullableSetOfNullableDates(
            final java.util.Set<org.joda.time.LocalDate> value) {
        this.nullableSetOfNullableDates = value;

        return this;
    }
}
