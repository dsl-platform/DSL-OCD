package com.dslplatform.ocd.values.ArrayDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayDateValue implements java.io.Serializable {
    public ArrayDateValue(
            final org.joda.time.LocalDate[] arrayDate) {
        setArrayDate(arrayDate);
    }

    public ArrayDateValue() {
        this.arrayDate = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 743172804;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayDateValue)) return false;
        final ArrayDateValue other = (ArrayDateValue) obj;

        if (!(java.util.Arrays.equals(this.arrayDate, other.arrayDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayDateValue(" + arrayDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] arrayDate;

    @JsonProperty("arrayDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getArrayDate() {
        return arrayDate;
    }

    public ArrayDateValue setArrayDate(final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayDate\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.arrayDate = value;

        return this;
    }
}
