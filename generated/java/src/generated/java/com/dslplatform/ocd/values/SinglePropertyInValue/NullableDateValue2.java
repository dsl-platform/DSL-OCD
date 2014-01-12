package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableDateValue2 implements java.io.Serializable {
    public NullableDateValue2(
            final org.joda.time.LocalDate nullableDate) {
        setNullableDate(nullableDate);
    }

    public NullableDateValue2() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1828213406;
        result = prime
                * result
                + (this.nullableDate != null ? this.nullableDate.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableDateValue2)) return false;
        final NullableDateValue2 other = (NullableDateValue2) obj;

        if (!(this.nullableDate == other.nullableDate || this.nullableDate != null
                && this.nullableDate.equals(other.nullableDate))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableDateValue2(" + nullableDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate nullableDate;

    @JsonProperty("nullableDate")
    public org.joda.time.LocalDate getNullableDate() {
        return nullableDate;
    }

    public NullableDateValue2 setNullableDate(
            final org.joda.time.LocalDate value) {
        this.nullableDate = value;

        return this;
    }
}
