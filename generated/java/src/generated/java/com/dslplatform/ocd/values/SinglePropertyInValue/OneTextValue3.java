package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneTextValue3 implements java.io.Serializable {
    public OneTextValue3(
            final String oneText) {
        setOneText(oneText);
    }

    public OneTextValue3() {
        this.oneText = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1948488079;
        result = prime * result
                + (this.oneText != null ? this.oneText.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneTextValue3)) return false;
        final OneTextValue3 other = (OneTextValue3) obj;

        if (!(this.oneText.equals(other.oneText))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneTextValue3(" + oneText + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneText;

    @JsonProperty("oneText")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneText() {
        return oneText;
    }

    public OneTextValue3 setOneText(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneText\" cannot be null!");
        this.oneText = value;

        return this;
    }
}
