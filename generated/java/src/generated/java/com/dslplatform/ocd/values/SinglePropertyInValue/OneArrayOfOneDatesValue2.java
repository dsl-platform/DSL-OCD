package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneDatesValue2 implements java.io.Serializable {
    public OneArrayOfOneDatesValue2(
            final org.joda.time.LocalDate[] oneArrayOfOneDates) {
        setOneArrayOfOneDates(oneArrayOfOneDates);
    }

    public OneArrayOfOneDatesValue2() {
        this.oneArrayOfOneDates = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1433140222;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneDatesValue2)) return false;
        final OneArrayOfOneDatesValue2 other = (OneArrayOfOneDatesValue2) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneDates,
                other.oneArrayOfOneDates))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneDatesValue2(" + oneArrayOfOneDates + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] oneArrayOfOneDates;

    @JsonProperty("oneArrayOfOneDates")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getOneArrayOfOneDates() {
        return oneArrayOfOneDates;
    }

    public OneArrayOfOneDatesValue2 setOneArrayOfOneDates(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneDates\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneArrayOfOneDates = value;

        return this;
    }
}
