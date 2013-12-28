package com.dslplatform.ocd.values.OneIntInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIntValue implements java.io.Serializable {
    public OneIntValue(
            final int oneInt) {
        setOneInt(oneInt);
    }

    public OneIntValue() {
        this.oneInt = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 370058584;
        result = prime * result + (this.oneInt);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIntValue)) return false;
        final OneIntValue other = (OneIntValue) obj;

        if (!(this.oneInt == other.oneInt)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIntValue(" + oneInt + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInt;

    @JsonProperty("oneInt")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInt() {
        return oneInt;
    }

    public OneIntValue setOneInt(final int value) {
        this.oneInt = value;

        return this;
    }
}
