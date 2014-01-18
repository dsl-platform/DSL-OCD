package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBooleans_1 implements java.io.Serializable {
    public OneArrayOfNullableBooleans_1(
            final Boolean[] oneArrayOfNullableBooleans) {
        setOneArrayOfNullableBooleans(oneArrayOfNullableBooleans);
    }

    public OneArrayOfNullableBooleans_1() {
        this.oneArrayOfNullableBooleans = new Boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 758832190;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBooleans_1)) return false;
        final OneArrayOfNullableBooleans_1 other = (OneArrayOfNullableBooleans_1) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableBooleans,
                other.oneArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBooleans_1(" + oneArrayOfNullableBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] oneArrayOfNullableBooleans;

    @JsonProperty("oneArrayOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getOneArrayOfNullableBooleans() {
        return oneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleans_1 setOneArrayOfNullableBooleans(
            final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBooleans\" cannot be null!");
        this.oneArrayOfNullableBooleans = value;

        return this;
    }
}
