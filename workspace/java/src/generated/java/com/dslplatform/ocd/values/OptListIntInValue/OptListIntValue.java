package com.dslplatform.ocd.values.OptListIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptListIntValue implements java.io.Serializable {
    public OptListIntValue(
            final java.util.List<Integer> optListInt) {
        setOptListInt(optListInt);
    }

    public OptListIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1937946751;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptListIntValue)) return false;
        final OptListIntValue other = (OptListIntValue) obj;

        if (!(this.optListInt == other.optListInt || this.optListInt != null
                && this.optListInt.equals(other.optListInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptListIntValue(" + optListInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<Integer> optListInt;

    @JsonProperty("optListInt")
    public java.util.List<Integer> getOptListInt() {
        return optListInt;
    }

    public OptListIntValue setOptListInt(final java.util.List<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optListInt = value;

        return this;
    }
}
