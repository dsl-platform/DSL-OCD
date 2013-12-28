package com.dslplatform.ocd.values.OptSetOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetOptIntValue implements java.io.Serializable {
    public OptSetOptIntValue(
            final java.util.Set<Integer> optSetOptInt) {
        setOptSetOptInt(optSetOptInt);
    }

    public OptSetOptIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 169751272;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptIntValue)) return false;
        final OptSetOptIntValue other = (OptSetOptIntValue) obj;

        if (!(this.optSetOptInt == other.optSetOptInt || this.optSetOptInt != null
                && this.optSetOptInt.equals(other.optSetOptInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptIntValue(" + optSetOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> optSetOptInt;

    @JsonProperty("optSetOptInt")
    public java.util.Set<Integer> getOptSetOptInt() {
        return optSetOptInt;
    }

    public OptSetOptIntValue setOptSetOptInt(final java.util.Set<Integer> value) {
        this.optSetOptInt = value;

        return this;
    }
}
