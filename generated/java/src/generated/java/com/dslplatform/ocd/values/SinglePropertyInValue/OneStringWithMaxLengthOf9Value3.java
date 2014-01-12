package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class OneStringWithMaxLengthOf9Value3 implements
        java.io.Serializable {
    public OneStringWithMaxLengthOf9Value3(
            final String oneStringWithMaxLengthOf9) {
        setOneStringWithMaxLengthOf9(oneStringWithMaxLengthOf9);
    }

    public OneStringWithMaxLengthOf9Value3() {
        this.oneStringWithMaxLengthOf9 = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 918437225;
        result = prime
                * result
                + (this.oneStringWithMaxLengthOf9 != null
                        ? this.oneStringWithMaxLengthOf9.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneStringWithMaxLengthOf9Value3)) return false;
        final OneStringWithMaxLengthOf9Value3 other = (OneStringWithMaxLengthOf9Value3) obj;

        if (!(this.oneStringWithMaxLengthOf9
                .equals(other.oneStringWithMaxLengthOf9))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneStringWithMaxLengthOf9Value3(" + oneStringWithMaxLengthOf9
                + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneStringWithMaxLengthOf9;

    @JsonProperty("oneStringWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneStringWithMaxLengthOf9() {
        return oneStringWithMaxLengthOf9;
    }

    public OneStringWithMaxLengthOf9Value3 setOneStringWithMaxLengthOf9(
            final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneStringWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.values.Guards.checkLength(value, 9);
        this.oneStringWithMaxLengthOf9 = value;

        return this;
    }
}
