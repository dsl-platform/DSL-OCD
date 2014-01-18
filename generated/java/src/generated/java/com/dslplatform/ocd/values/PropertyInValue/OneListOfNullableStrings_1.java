package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfNullableStrings_1 implements java.io.Serializable {
    public OneListOfNullableStrings_1(
            final java.util.List<String> oneListOfNullableStrings) {
        setOneListOfNullableStrings(oneListOfNullableStrings);
    }

    public OneListOfNullableStrings_1() {
        this.oneListOfNullableStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1629792716;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfNullableStrings_1)) return false;
        final OneListOfNullableStrings_1 other = (OneListOfNullableStrings_1) obj;

        if (!(this.oneListOfNullableStrings
                .equals(other.oneListOfNullableStrings))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfNullableStrings_1(" + oneListOfNullableStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfNullableStrings;

    @JsonProperty("oneListOfNullableStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableStrings() {
        return oneListOfNullableStrings;
    }

    public OneListOfNullableStrings_1 setOneListOfNullableStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableStrings\" cannot be null!");
        this.oneListOfNullableStrings = value;

        return this;
    }
}
