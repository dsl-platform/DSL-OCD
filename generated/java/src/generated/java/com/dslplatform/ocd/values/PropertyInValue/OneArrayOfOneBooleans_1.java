package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfOneBooleans_1 implements java.io.Serializable {
    public OneArrayOfOneBooleans_1(
            final boolean[] oneArrayOfOneBooleans) {
        setOneArrayOfOneBooleans(oneArrayOfOneBooleans);
    }

    public OneArrayOfOneBooleans_1() {
        this.oneArrayOfOneBooleans = new boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1529665015;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfOneBooleans_1)) return false;
        final OneArrayOfOneBooleans_1 other = (OneArrayOfOneBooleans_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfOneBooleans,
                other.oneArrayOfOneBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfOneBooleans_1(" + oneArrayOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private boolean[] oneArrayOfOneBooleans;

    @JsonProperty("oneArrayOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public boolean[] getOneArrayOfOneBooleans() {
        return oneArrayOfOneBooleans;
    }

    public OneArrayOfOneBooleans_1 setOneArrayOfOneBooleans(
            final boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneBooleans\" cannot be null!");
        this.oneArrayOfOneBooleans = value;

        return this;
    }
}
