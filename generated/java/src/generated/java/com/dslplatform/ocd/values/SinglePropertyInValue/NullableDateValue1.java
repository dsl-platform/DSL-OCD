package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDateValue1 implements java.io.Serializable {
    public NullableDateValue1(
            final org.joda.time.LocalDate nullableDate) {
        setNullableDate(nullableDate);
    }

    public NullableDateValue1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 262129465;
        result = prime
                * result
                + (this.nullableDate != null ? this.nullableDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDateValue1)) return false;
        final NullableDateValue1 other = (NullableDateValue1) obj;

        if (!(this.nullableDate == other.nullableDate || this.nullableDate != null
                && this.nullableDate.equals(other.nullableDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDateValue1(" + nullableDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate nullableDate;

    @JsonProperty("nullableDate")
    public org.joda.time.LocalDate getNullableDate() {
        return nullableDate;
    }

    public NullableDateValue1 setNullableDate(
            final org.joda.time.LocalDate value) {
        this.nullableDate = value;

        return this;
    }
}
