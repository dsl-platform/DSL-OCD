package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBooleansValue10 implements java.io.Serializable {
    public OneArrayOfOneBooleansValue10(
            final boolean[] oneArrayOfOneBooleans) {
        setOneArrayOfOneBooleans(oneArrayOfOneBooleans);
    }

    public OneArrayOfOneBooleansValue10() {
        this.oneArrayOfOneBooleans = new boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1468112403;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBooleansValue10)) return false;
        final OneArrayOfOneBooleansValue10 other = (OneArrayOfOneBooleansValue10) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneBooleans,
                other.oneArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBooleansValue10(" + oneArrayOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] oneArrayOfOneBooleans;

    @JsonProperty("oneArrayOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean[] getOneArrayOfOneBooleans() {
        return oneArrayOfOneBooleans;
    }

    public OneArrayOfOneBooleansValue10 setOneArrayOfOneBooleans(
            final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBooleans\" cannot be null!");
        this.oneArrayOfOneBooleans = value;

        return this;
    }
}
