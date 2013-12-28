package com.dslplatform.ocd.values.OptSetIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OptSetIntValue implements java.io.Serializable {
    public OptSetIntValue(
            final java.util.Set<Integer> optSetInt) {
        setOptSetInt(optSetInt);
    }

    public OptSetIntValue() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 554574881;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetIntValue)) return false;
        final OptSetIntValue other = (OptSetIntValue) obj;

        if (!(this.optSetInt == other.optSetInt || this.optSetInt != null
                && this.optSetInt.equals(other.optSetInt))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetIntValue(" + optSetInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Integer> optSetInt;

    @JsonProperty("optSetInt")
    public java.util.Set<Integer> getOptSetInt() {
        return optSetInt;
    }

    public OptSetIntValue setOptSetInt(final java.util.Set<Integer> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.optSetInt = value;

        return this;
    }
}
