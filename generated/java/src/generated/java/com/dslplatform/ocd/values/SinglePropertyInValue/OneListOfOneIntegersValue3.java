package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneIntegersValue3 implements java.io.Serializable {
    public OneListOfOneIntegersValue3(
            final java.util.List<Integer> oneListOfOneIntegers) {
        setOneListOfOneIntegers(oneListOfOneIntegers);
    }

    public OneListOfOneIntegersValue3() {
        this.oneListOfOneIntegers = new java.util.ArrayList<Integer>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 340633500;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneIntegersValue3)) return false;
        final OneListOfOneIntegersValue3 other = (OneListOfOneIntegersValue3) obj;

        if (!(this.oneListOfOneIntegers.equals(other.oneListOfOneIntegers)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneIntegersValue3(" + oneListOfOneIntegers + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> oneListOfOneIntegers;

    @JsonProperty("oneListOfOneIntegers")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Integer> getOneListOfOneIntegers() {
        return oneListOfOneIntegers;
    }

    public OneListOfOneIntegersValue3 setOneListOfOneIntegers(
            final java.util.List<Integer> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneIntegers\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneIntegers = value;

        return this;
    }
}
