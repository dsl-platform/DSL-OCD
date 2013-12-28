package com.dslplatform.ocd.values.OptListOptIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListOptIntValue implements java.io.Serializable {
    public OptListOptIntValue(
            final java.util.List<Integer> optListOptInt) {
        setOptListOptInt(optListOptInt);
    }

    public OptListOptIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 991847334;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListOptIntValue)) return false;
        final OptListOptIntValue other = (OptListOptIntValue) obj;

        if (!(this.optListOptInt == other.optListOptInt || this.optListOptInt != null
                && this.optListOptInt.equals(other.optListOptInt)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListOptIntValue(" + optListOptInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> optListOptInt;

    @JsonProperty("optListOptInt")
    public java.util.List<Integer> getOptListOptInt() {
        return optListOptInt;
    }

    public OptListOptIntValue setOptListOptInt(
            final java.util.List<Integer> value) {
        this.optListOptInt = value;

        return this;
    }
}
