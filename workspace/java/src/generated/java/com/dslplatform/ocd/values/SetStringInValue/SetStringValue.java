package com.dslplatform.ocd.values.SetStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetStringValue implements java.io.Serializable {
    public SetStringValue(
            final java.util.Set<String> setString) {
        setSetString(setString);
    }

    public SetStringValue() {
        this.setString = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1560539556;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetStringValue)) return false;
        final SetStringValue other = (SetStringValue) obj;

        if (!(this.setString.equals(other.setString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetStringValue(" + setString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> setString;

    @JsonProperty("setString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getSetString() {
        return setString;
    }

    public SetStringValue setSetString(final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setString\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.setString = value;

        return this;
    }
}
