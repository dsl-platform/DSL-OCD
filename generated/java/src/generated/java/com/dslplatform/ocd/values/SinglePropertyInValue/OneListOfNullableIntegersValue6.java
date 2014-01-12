package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableIntegersValue6 implements
        java.io.Serializable {
    public OneListOfNullableIntegersValue6(
            final java.util.List<Integer> oneListOfNullableIntegers) {
        setOneListOfNullableIntegers(oneListOfNullableIntegers);
    }

    public OneListOfNullableIntegersValue6() {
        this.oneListOfNullableIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1062354020;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableIntegersValue6)) return false;
        final OneListOfNullableIntegersValue6 other = (OneListOfNullableIntegersValue6) obj;

        if (!(this.oneListOfNullableIntegers
                .equals(other.oneListOfNullableIntegers))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableIntegersValue6(" + oneListOfNullableIntegers
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfNullableIntegers;

    @JsonProperty("oneListOfNullableIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfNullableIntegers() {
        return oneListOfNullableIntegers;
    }

    public OneListOfNullableIntegersValue6 setOneListOfNullableIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableIntegers\" cannot be null!");
        this.oneListOfNullableIntegers = value;

        return this;
    }
}
