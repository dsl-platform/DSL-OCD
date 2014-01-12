package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneIntegersValue5 implements java.io.Serializable {
    public OneListOfOneIntegersValue5(
            final java.util.List<Integer> oneListOfOneIntegers) {
        setOneListOfOneIntegers(oneListOfOneIntegers);
    }

    public OneListOfOneIntegersValue5() {
        this.oneListOfOneIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1503432914;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneIntegersValue5)) return false;
        final OneListOfOneIntegersValue5 other = (OneListOfOneIntegersValue5) obj;

        if (!(this.oneListOfOneIntegers.equals(other.oneListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneIntegersValue5(" + oneListOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfOneIntegers;

    @JsonProperty("oneListOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfOneIntegers() {
        return oneListOfOneIntegers;
    }

    public OneListOfOneIntegersValue5 setOneListOfOneIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIntegers\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneIntegers = value;

        return this;
    }
}
