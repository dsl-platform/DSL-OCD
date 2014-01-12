package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableBooleansValue3 implements
        java.io.Serializable {
    public OneListOfNullableBooleansValue3(
            final java.util.List<Boolean> oneListOfNullableBooleans) {
        setOneListOfNullableBooleans(oneListOfNullableBooleans);
    }

    public OneListOfNullableBooleansValue3() {
        this.oneListOfNullableBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 726704163;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableBooleansValue3)) return false;
        final OneListOfNullableBooleansValue3 other = (OneListOfNullableBooleansValue3) obj;

        if (!(this.oneListOfNullableBooleans
                .equals(other.oneListOfNullableBooleans))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableBooleansValue3(" + oneListOfNullableBooleans
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfNullableBooleans;

    @JsonProperty("oneListOfNullableBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfNullableBooleans() {
        return oneListOfNullableBooleans;
    }

    public OneListOfNullableBooleansValue3 setOneListOfNullableBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableBooleans\" cannot be null!");
        this.oneListOfNullableBooleans = value;

        return this;
    }
}
