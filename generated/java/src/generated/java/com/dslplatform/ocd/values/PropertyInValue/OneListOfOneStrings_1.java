package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneStrings_1 implements java.io.Serializable {
    public OneListOfOneStrings_1(
            final java.util.List<String> oneListOfOneStrings) {
        setOneListOfOneStrings(oneListOfOneStrings);
    }

    public OneListOfOneStrings_1() {
        this.oneListOfOneStrings = new java.util.ArrayList<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1131649125;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneStrings_1)) return false;
        final OneListOfOneStrings_1 other = (OneListOfOneStrings_1) obj;

        if (!(this.oneListOfOneStrings.equals(other.oneListOfOneStrings)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneStrings_1(" + oneListOfOneStrings + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<String> oneListOfOneStrings;

    @JsonProperty("oneListOfOneStrings")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfOneStrings() {
        return oneListOfOneStrings;
    }

    public OneListOfOneStrings_1 setOneListOfOneStrings(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneStrings\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneStrings = value;

        return this;
    }
}
