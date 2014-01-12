package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneDatesValue2 implements
        java.io.Serializable {
    public NullableArrayOfOneDatesValue2(
            final org.joda.time.LocalDate[] nullableArrayOfOneDates) {
        setNullableArrayOfOneDates(nullableArrayOfOneDates);
    }

    public NullableArrayOfOneDatesValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 904972357;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneDatesValue2)) return false;
        final NullableArrayOfOneDatesValue2 other = (NullableArrayOfOneDatesValue2) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneDates,
                other.nullableArrayOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneDatesValue2(" + nullableArrayOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] nullableArrayOfOneDates;

    @JsonProperty("nullableArrayOfOneDates")
    public org.joda.time.LocalDate[] getNullableArrayOfOneDates() {
        return nullableArrayOfOneDates;
    }

    public NullableArrayOfOneDatesValue2 setNullableArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableArrayOfOneDates = value;

        return this;
    }
}
