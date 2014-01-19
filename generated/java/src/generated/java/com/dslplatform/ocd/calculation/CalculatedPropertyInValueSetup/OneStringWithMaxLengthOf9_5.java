package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class OneStringWithMaxLengthOf9_5 implements java.io.Serializable {
    public OneStringWithMaxLengthOf9_5(
            final String oneStringWithMaxLengthOf9,
            final String calculatedOneStringWithMaxLengthOf9,
            final String persistedOneStringWithMaxLengthOf9) {
        setOneStringWithMaxLengthOf9(oneStringWithMaxLengthOf9);
        this.calculatedOneStringWithMaxLengthOf9 = calculatedOneStringWithMaxLengthOf9;
        this.persistedOneStringWithMaxLengthOf9 = persistedOneStringWithMaxLengthOf9;
    }

    public OneStringWithMaxLengthOf9_5() {
        this.oneStringWithMaxLengthOf9 = "";
        this.calculatedOneStringWithMaxLengthOf9 = "";
        this.persistedOneStringWithMaxLengthOf9 = "";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1312559141;
        result = prime
                * result
                + (this.oneStringWithMaxLengthOf9 != null
                        ? this.oneStringWithMaxLengthOf9.hashCode()
                        : 0);
        result = prime
                * result
                + (this.calculatedOneStringWithMaxLengthOf9 != null
                        ? this.calculatedOneStringWithMaxLengthOf9.hashCode()
                        : 0);
        result = prime
                * result
                + (this.persistedOneStringWithMaxLengthOf9 != null
                        ? this.persistedOneStringWithMaxLengthOf9.hashCode()
                        : 0);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OneStringWithMaxLengthOf9_5)) return false;
        final OneStringWithMaxLengthOf9_5 other = (OneStringWithMaxLengthOf9_5) obj;

        if (!(this.oneStringWithMaxLengthOf9
                .equals(other.oneStringWithMaxLengthOf9))) return false;
        if (!(this.calculatedOneStringWithMaxLengthOf9
                .equals(other.calculatedOneStringWithMaxLengthOf9)))
            return false;
        if (!(this.persistedOneStringWithMaxLengthOf9
                .equals(other.persistedOneStringWithMaxLengthOf9)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OneStringWithMaxLengthOf9_5(" + oneStringWithMaxLengthOf9 + ','
                + calculatedOneStringWithMaxLengthOf9 + ','
                + persistedOneStringWithMaxLengthOf9 + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private String oneStringWithMaxLengthOf9;

    @JsonProperty("oneStringWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOneStringWithMaxLengthOf9() {
        return oneStringWithMaxLengthOf9;
    }

    public OneStringWithMaxLengthOf9_5 setOneStringWithMaxLengthOf9(
            final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneStringWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.calculation.Guards.checkLength(value, 9);
        this.oneStringWithMaxLengthOf9 = value;

        return this;
    }

    private final String calculatedOneStringWithMaxLengthOf9;

    public String getCalculatedOneStringWithMaxLengthOf9() {
        return this.calculatedOneStringWithMaxLengthOf9;
    }

    private final String persistedOneStringWithMaxLengthOf9;

    public String getPersistedOneStringWithMaxLengthOf9() {
        return this.persistedOneStringWithMaxLengthOf9;
    }
}
