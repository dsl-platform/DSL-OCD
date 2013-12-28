package com.dslplatform.ocd.values.SetOptStringInValue;

import com.fasterxml.jackson.annotation.*;

public final class SetOptStringValue implements java.io.Serializable {
    public SetOptStringValue(
            final java.util.Set<String> setOptString) {
        setSetOptString(setOptString);
    }

    public SetOptStringValue() {
        this.setOptString = new java.util.HashSet<String>();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1831357429;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof SetOptStringValue)) return false;
        final SetOptStringValue other = (SetOptStringValue) obj;

        if (!(this.setOptString.equals(other.setOptString))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SetOptStringValue(" + setOptString + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<String> setOptString;

    @JsonProperty("setOptString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<String> getSetOptString() {
        return setOptString;
    }

    public SetOptStringValue setSetOptString(final java.util.Set<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptString\" cannot be null!");
        this.setOptString = value;

        return this;
    }
}
