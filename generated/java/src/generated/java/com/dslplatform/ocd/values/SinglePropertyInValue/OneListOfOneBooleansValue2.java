package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBooleansValue2 implements java.io.Serializable {
    public OneListOfOneBooleansValue2(
            final java.util.List<Boolean> oneListOfOneBooleans) {
        setOneListOfOneBooleans(oneListOfOneBooleans);
    }

    public OneListOfOneBooleansValue2() {
        this.oneListOfOneBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 709651745;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBooleansValue2)) return false;
        final OneListOfOneBooleansValue2 other = (OneListOfOneBooleansValue2) obj;

        if (!(this.oneListOfOneBooleans.equals(other.oneListOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBooleansValue2(" + oneListOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfOneBooleans;

    @JsonProperty("oneListOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfOneBooleans() {
        return oneListOfOneBooleans;
    }

    public OneListOfOneBooleansValue2 setOneListOfOneBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneBooleans = value;

        return this;
    }
}
