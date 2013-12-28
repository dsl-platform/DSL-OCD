package com.dslplatform.ocd.values.ArrayOptLongInValue;

import com.fasterxml.jackson.annotation.*;

public final class ArrayOptLongValue implements java.io.Serializable {
    public ArrayOptLongValue(
            final Long[] arrayOptLong) {
        setArrayOptLong(arrayOptLong);
    }

    public ArrayOptLongValue() {
        this.arrayOptLong = new Long[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 440071831;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof ArrayOptLongValue)) return false;
        final ArrayOptLongValue other = (ArrayOptLongValue) obj;

        if (!(java.util.Arrays.equals(this.arrayOptLong, other.arrayOptLong)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "ArrayOptLongValue(" + arrayOptLong + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Long[] arrayOptLong;

    @JsonProperty("arrayOptLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Long[] getArrayOptLong() {
        return arrayOptLong;
    }

    public ArrayOptLongValue setArrayOptLong(final Long[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"arrayOptLong\" cannot be null!");
        this.arrayOptLong = value;

        return this;
    }
}
