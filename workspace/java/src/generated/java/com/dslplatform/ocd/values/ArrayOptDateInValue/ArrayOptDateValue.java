package com.dslplatform.ocd.values.ArrayOptDateInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptDateValue implements java.io.Serializable {
    public ArrayOptDateValue(
            final org.joda.time.LocalDate[] arrayOptDate) {
        setArrayOptDate(arrayOptDate);
    }

    public ArrayOptDateValue() {
        this.arrayOptDate = new org.joda.time.LocalDate[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 304769505;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptDateValue)) return false;
        final ArrayOptDateValue other = (ArrayOptDateValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptDate, other.arrayOptDate)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptDateValue(" + arrayOptDate + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.LocalDate[] arrayOptDate;

    @JsonProperty("arrayOptDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate[] getArrayOptDate() {
        return arrayOptDate;
    }

    public ArrayOptDateValue setArrayOptDate(
            final org.joda.time.LocalDate[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptDate\" cannot be null!");
        this.arrayOptDate = value;

        return this;
    }
}
