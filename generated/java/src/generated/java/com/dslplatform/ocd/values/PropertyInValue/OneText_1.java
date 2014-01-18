package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneText_1 implements java.io.Serializable {
    public OneText_1(
            final String oneText) {
        setOneText(oneText);
    }

    public OneText_1() {
        this.oneText = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 852108615;
        result = prime * result
                + (this.oneText != null ? this.oneText.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneText_1)) return false;
        final OneText_1 other = (OneText_1) obj;

        if (!(this.oneText.equals(other.oneText))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneText_1(" + oneText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneText;

    @JsonProperty("oneText")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneText() {
        return oneText;
    }

    public OneText_1 setOneText(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneText\" cannot be null!");
        this.oneText = value;

        return this;
    }
}
