package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfNullableBooleansValue2 implements
        java.io.Serializable {
    public OneSetOfNullableBooleansValue2(
            final java.util.Set<Boolean> oneSetOfNullableBooleans) {
        setOneSetOfNullableBooleans(oneSetOfNullableBooleans);
    }

    public OneSetOfNullableBooleansValue2() {
        this.oneSetOfNullableBooleans = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1344309982;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfNullableBooleansValue2)) return false;
        final OneSetOfNullableBooleansValue2 other = (OneSetOfNullableBooleansValue2) obj;

        if (!(this.oneSetOfNullableBooleans
                .equals(other.oneSetOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfNullableBooleansValue2(" + oneSetOfNullableBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> oneSetOfNullableBooleans;

    @JsonProperty("oneSetOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getOneSetOfNullableBooleans() {
        return oneSetOfNullableBooleans;
    }

    public OneSetOfNullableBooleansValue2 setOneSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfNullableBooleans\" cannot be null!");
        this.oneSetOfNullableBooleans = value;

        return this;
    }
}
