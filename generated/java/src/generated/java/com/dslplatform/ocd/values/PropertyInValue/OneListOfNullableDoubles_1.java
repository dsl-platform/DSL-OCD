package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableDoubles_1 implements java.io.Serializable {
    public OneListOfNullableDoubles_1(
            final java.util.List<Double> oneListOfNullableDoubles) {
        setOneListOfNullableDoubles(oneListOfNullableDoubles);
    }

    public OneListOfNullableDoubles_1() {
        this.oneListOfNullableDoubles = new java.util.ArrayList<Double>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1375171820;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableDoubles_1)) return false;
        final OneListOfNullableDoubles_1 other = (OneListOfNullableDoubles_1) obj;

        if (!(this.oneListOfNullableDoubles
                .equals(other.oneListOfNullableDoubles))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableDoubles_1(" + oneListOfNullableDoubles + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Double> oneListOfNullableDoubles;

    @JsonProperty("oneListOfNullableDoubles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Double> getOneListOfNullableDoubles() {
        return oneListOfNullableDoubles;
    }

    public OneListOfNullableDoubles_1 setOneListOfNullableDoubles(
            final java.util.List<Double> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableDoubles\" cannot be null!");
        this.oneListOfNullableDoubles = value;

        return this;
    }
}
