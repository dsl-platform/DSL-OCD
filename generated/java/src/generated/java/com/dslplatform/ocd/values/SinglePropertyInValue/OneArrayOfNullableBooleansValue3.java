package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneArrayOfNullableBooleansValue3 implements
        java.io.Serializable {
    public OneArrayOfNullableBooleansValue3(
            final Boolean[] oneArrayOfNullableBooleans) {
        setOneArrayOfNullableBooleans(oneArrayOfNullableBooleans);
    }

    public OneArrayOfNullableBooleansValue3() {
        this.oneArrayOfNullableBooleans = new Boolean[] {};
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 35817488;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneArrayOfNullableBooleansValue3)) return false;
        final OneArrayOfNullableBooleansValue3 other = (OneArrayOfNullableBooleansValue3) obj;

        if (!(java.util.Arrays.equals(this.oneArrayOfNullableBooleans,
                other.oneArrayOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneArrayOfNullableBooleansValue3(" + oneArrayOfNullableBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private Boolean[] oneArrayOfNullableBooleans;

    @JsonProperty("oneArrayOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean[] getOneArrayOfNullableBooleans() {
        return oneArrayOfNullableBooleans;
    }

    public OneArrayOfNullableBooleansValue3 setOneArrayOfNullableBooleans(
            final Boolean[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfNullableBooleans\" cannot be null!");
        this.oneArrayOfNullableBooleans = value;

        return this;
    }
}
