package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneBooleansValue5 implements java.io.Serializable {
    public OneSetOfOneBooleansValue5(
            final java.util.Set<Boolean> oneSetOfOneBooleans) {
        setOneSetOfOneBooleans(oneSetOfOneBooleans);
    }

    public OneSetOfOneBooleansValue5() {
        this.oneSetOfOneBooleans = new java.util.HashSet<Boolean>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1897938448;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneBooleansValue5)) return false;
        final OneSetOfOneBooleansValue5 other = (OneSetOfOneBooleansValue5) obj;

        if (!(this.oneSetOfOneBooleans.equals(other.oneSetOfOneBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneBooleansValue5(" + oneSetOfOneBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> oneSetOfOneBooleans;

    @JsonProperty("oneSetOfOneBooleans")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getOneSetOfOneBooleans() {
        return oneSetOfOneBooleans;
    }

    public OneSetOfOneBooleansValue5 setOneSetOfOneBooleans(
            final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneBooleans\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneBooleans = value;

        return this;
    }
}
