package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIntegersValue2 implements
        java.io.Serializable {
    public OneListOfNullableIntegersValue2(
            final java.util.List<Integer> oneListOfNullableIntegers) {
        setOneListOfNullableIntegers(oneListOfNullableIntegers);
    }

    public OneListOfNullableIntegersValue2() {
        this.oneListOfNullableIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1062354016;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIntegersValue2)) return false;
        final OneListOfNullableIntegersValue2 other = (OneListOfNullableIntegersValue2) obj;

        if (!(this.oneListOfNullableIntegers
                .equals(other.oneListOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIntegersValue2(" + oneListOfNullableIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfNullableIntegers;

    @JsonProperty("oneListOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfNullableIntegers() {
        return oneListOfNullableIntegers;
    }

    public OneListOfNullableIntegersValue2 setOneListOfNullableIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIntegers\" cannot be null!");
        this.oneListOfNullableIntegers = value;

        return this;
    }
}
