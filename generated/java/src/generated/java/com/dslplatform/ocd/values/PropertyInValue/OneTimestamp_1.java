package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneTimestamp_1 implements java.io.Serializable {
    public OneTimestamp_1(
            final org.joda.time.DateTime oneTimestamp) {
        setOneTimestamp(oneTimestamp);
    }

    public OneTimestamp_1() {
        this.oneTimestamp = new org.joda.time.DateTime();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 692294602;
        result = prime
                * result
                + (this.oneTimestamp != null ? this.oneTimestamp.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneTimestamp_1)) return false;
        final OneTimestamp_1 other = (OneTimestamp_1) obj;

        if (!(this.oneTimestamp.equals(other.oneTimestamp))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneTimestamp_1(" + oneTimestamp + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.joda.time.DateTime oneTimestamp;

    @JsonProperty("oneTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime getOneTimestamp() {
        return oneTimestamp;
    }

    public OneTimestamp_1 setOneTimestamp(final org.joda.time.DateTime value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneTimestamp\" cannot be null!");
        this.oneTimestamp = value;

        return this;
    }
}
