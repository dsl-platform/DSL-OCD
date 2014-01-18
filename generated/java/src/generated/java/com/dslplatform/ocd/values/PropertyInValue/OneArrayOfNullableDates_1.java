package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableDates_1 implements java.io.Serializable {
    public OneArrayOfNullableDates_1(
            final org.joda.time.LocalDate[] oneArrayOfNullableDates) {
        setOneArrayOfNullableDates(oneArrayOfNullableDates);
    }

    public OneArrayOfNullableDates_1() {
        this.oneArrayOfNullableDates = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1257966040;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableDates_1)) return false;
        final OneArrayOfNullableDates_1 other = (OneArrayOfNullableDates_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableDates,
                other.oneArrayOfNullableDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableDates_1(" + oneArrayOfNullableDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] oneArrayOfNullableDates;

    @JsonProperty("oneArrayOfNullableDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getOneArrayOfNullableDates() {
        return oneArrayOfNullableDates;
    }

    public OneArrayOfNullableDates_1 setOneArrayOfNullableDates(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableDates\" cannot be null!");
        this.oneArrayOfNullableDates = value;

        return this;
    }
}
