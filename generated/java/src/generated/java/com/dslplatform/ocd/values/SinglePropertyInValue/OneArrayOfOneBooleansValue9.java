package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBooleansValue9 implements java.io.Serializable {
    public OneArrayOfOneBooleansValue9(
            final boolean[] oneArrayOfOneBooleans) {
        setOneArrayOfOneBooleans(oneArrayOfOneBooleans);
    }

    public OneArrayOfOneBooleansValue9() {
        this.oneArrayOfOneBooleans = new boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2015824277;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBooleansValue9)) return false;
        final OneArrayOfOneBooleansValue9 other = (OneArrayOfOneBooleansValue9) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneBooleans,
                other.oneArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBooleansValue9(" + oneArrayOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] oneArrayOfOneBooleans;

    @JsonProperty("oneArrayOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean[] getOneArrayOfOneBooleans() {
        return oneArrayOfOneBooleans;
    }

    public OneArrayOfOneBooleansValue9 setOneArrayOfOneBooleans(
            final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBooleans\" cannot be null!");
        this.oneArrayOfOneBooleans = value;

        return this;
    }
}
