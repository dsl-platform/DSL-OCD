package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDatesValue6 implements
        java.io.Serializable {
    public NullableArrayOfOneDatesValue6(
            final org.joda.time.LocalDate[] nullableArrayOfOneDates) {
        setNullableArrayOfOneDates(nullableArrayOfOneDates);
    }

    public NullableArrayOfOneDatesValue6() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 904972361;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDatesValue6)) return false;
        final NullableArrayOfOneDatesValue6 other = (NullableArrayOfOneDatesValue6) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDates,
                other.nullableArrayOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDatesValue6(" + nullableArrayOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfOneDates;

    @JsonProperty("nullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getNullableArrayOfOneDates() {
        return nullableArrayOfOneDates;
    }

    public NullableArrayOfOneDatesValue6 setNullableArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneDates = value;

        return this;
    }
}
