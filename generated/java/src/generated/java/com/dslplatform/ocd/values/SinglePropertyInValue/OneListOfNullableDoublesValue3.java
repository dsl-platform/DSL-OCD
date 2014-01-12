package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDoublesValue3 implements
        java.io.Serializable {
    public OneListOfNullableDoublesValue3(
            final java.util.List<Double> oneListOfNullableDoubles) {
        setOneListOfNullableDoubles(oneListOfNullableDoubles);
    }

    public OneListOfNullableDoublesValue3() {
        this.oneListOfNullableDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1772314446;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDoublesValue3)) return false;
        final OneListOfNullableDoublesValue3 other = (OneListOfNullableDoublesValue3) obj;

        if (!(this.oneListOfNullableDoubles
                .equals(other.oneListOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDoublesValue3(" + oneListOfNullableDoubles
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfNullableDoubles;

    @JsonProperty("oneListOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfNullableDoubles() {
        return oneListOfNullableDoubles;
    }

    public OneListOfNullableDoublesValue3 setOneListOfNullableDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDoubles\" cannot be null!");
        this.oneListOfNullableDoubles = value;

        return this;
    }
}
