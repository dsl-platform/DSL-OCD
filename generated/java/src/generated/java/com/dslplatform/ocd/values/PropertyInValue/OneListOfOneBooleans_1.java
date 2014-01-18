package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBooleans_1 implements java.io.Serializable {
    public OneListOfOneBooleans_1(
            final java.util.List<Boolean> oneListOfOneBooleans) {
        setOneListOfOneBooleans(oneListOfOneBooleans);
    }

    public OneListOfOneBooleans_1() {
        this.oneListOfOneBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1951976488;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBooleans_1)) return false;
        final OneListOfOneBooleans_1 other = (OneListOfOneBooleans_1) obj;

        if (!(this.oneListOfOneBooleans.equals(other.oneListOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBooleans_1(" + oneListOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfOneBooleans;

    @JsonProperty("oneListOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfOneBooleans() {
        return oneListOfOneBooleans;
    }

    public OneListOfOneBooleans_1 setOneListOfOneBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneBooleans = value;

        return this;
    }
}
