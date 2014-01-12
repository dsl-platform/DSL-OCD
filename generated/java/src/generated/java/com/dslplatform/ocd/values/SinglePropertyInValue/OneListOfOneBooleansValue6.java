package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneListOfOneBooleansValue6 implements java.io.Serializable {
    public OneListOfOneBooleansValue6(
            final java.util.List<Boolean> oneListOfOneBooleans) {
        setOneListOfOneBooleans(oneListOfOneBooleans);
    }

    public OneListOfOneBooleansValue6() {
        this.oneListOfOneBooleans = new java.util.ArrayList<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1259716723;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneListOfOneBooleansValue6)) return false;
        final OneListOfOneBooleansValue6 other = (OneListOfOneBooleansValue6) obj;

        if (!(this.oneListOfOneBooleans.equals(other.oneListOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneListOfOneBooleansValue6(" + oneListOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Boolean> oneListOfOneBooleans;

    @JsonProperty("oneListOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<Boolean> getOneListOfOneBooleans() {
        return oneListOfOneBooleans;
    }

    public OneListOfOneBooleansValue6 setOneListOfOneBooleans(
            final java.util.List<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneListOfOneBooleans = value;

        return this;
    }
}
