package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDate_1 implements java.io.Serializable {
    public NullableDate_1(
            final org.joda.time.LocalDate nullableDate) {
        setNullableDate(nullableDate);
    }

    public NullableDate_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 699899349;
        result = prime
                * result
                + (this.nullableDate != null ? this.nullableDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDate_1)) return false;
        final NullableDate_1 other = (NullableDate_1) obj;

        if (!(this.nullableDate == other.nullableDate || this.nullableDate != null
                && this.nullableDate.equals(other.nullableDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDate_1(" + nullableDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate nullableDate;

    @JsonProperty("nullableDate")
    public org.joda.time.LocalDate getNullableDate() {
        return nullableDate;
    }

    public NullableDate_1 setNullableDate(final org.joda.time.LocalDate value) {
        this.nullableDate = value;

        return this;
    }
}
