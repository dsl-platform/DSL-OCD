package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIntegerValue4 implements java.io.Serializable {
    public OneIntegerValue4(
            final int oneInteger) {
        setOneInteger(oneInteger);
    }

    public OneIntegerValue4() {
        this.oneInteger = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1684716621;
        result = prime * result + (this.oneInteger);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIntegerValue4)) return false;
        final OneIntegerValue4 other = (OneIntegerValue4) obj;

        if (!(this.oneInteger == other.oneInteger)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIntegerValue4(" + oneInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInteger;

    @JsonProperty("oneInteger")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInteger() {
        return oneInteger;
    }

    public OneIntegerValue4 setOneInteger(final int value) {
        this.oneInteger = value;

        return this;
    }
}
