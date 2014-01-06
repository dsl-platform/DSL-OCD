package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneIntegerValue3 implements java.io.Serializable {
    public OneIntegerValue3(
            final int oneInteger) {
        setOneInteger(oneInteger);
    }

    public OneIntegerValue3() {
        this.oneInteger = 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1044166734;
        result = prime * result + (this.oneInteger);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneIntegerValue3)) return false;
        final OneIntegerValue3 other = (OneIntegerValue3) obj;

        if (!(this.oneInteger == other.oneInteger)) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneIntegerValue3(" + oneInteger + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private int oneInteger;

    @JsonProperty("oneInteger")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getOneInteger() {
        return oneInteger;
    }

    public OneIntegerValue3 setOneInteger(final int value) {
        this.oneInteger = value;

        return this;
    }
}
