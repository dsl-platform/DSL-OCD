package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneSetOfOneTimestamps_1 implements java.io.Serializable {
    public OneSetOfOneTimestamps_1(
            final java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps) {
        setOneSetOfOneTimestamps(oneSetOfOneTimestamps);
    }

    public OneSetOfOneTimestamps_1() {
        this.oneSetOfOneTimestamps = new java.util.HashSet<org.joda.time.DateTime>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1919340792;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneSetOfOneTimestamps_1)) return false;
        final OneSetOfOneTimestamps_1 other = (OneSetOfOneTimestamps_1) obj;

        if (!(this.oneSetOfOneTimestamps.equals(other.oneSetOfOneTimestamps)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneSetOfOneTimestamps_1(" + oneSetOfOneTimestamps + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.joda.time.DateTime> oneSetOfOneTimestamps;

    @JsonProperty("oneSetOfOneTimestamps")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<org.joda.time.DateTime> getOneSetOfOneTimestamps() {
        return oneSetOfOneTimestamps;
    }

    public OneSetOfOneTimestamps_1 setOneSetOfOneTimestamps(
            final java.util.Set<org.joda.time.DateTime> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneSetOfOneTimestamps\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.oneSetOfOneTimestamps = value;

        return this;
    }
}
