package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDatesValue5 implements
        java.io.Serializable {
    public OneArrayOfNullableDatesValue5(
            final org.joda.time.LocalDate[] oneArrayOfNullableDates) {
        setOneArrayOfNullableDates(oneArrayOfNullableDates);
    }

    public OneArrayOfNullableDatesValue5() {
        this.oneArrayOfNullableDates = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1685906616;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDatesValue5)) return false;
        final OneArrayOfNullableDatesValue5 other = (OneArrayOfNullableDatesValue5) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDates,
                other.oneArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDatesValue5(" + oneArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] oneArrayOfNullableDates;

    @JsonProperty("oneArrayOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getOneArrayOfNullableDates() {
        return oneArrayOfNullableDates;
    }

    public OneArrayOfNullableDatesValue5 setOneArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDates\" cannot be null!");
        this.oneArrayOfNullableDates = value;

        return this;
    }
}
