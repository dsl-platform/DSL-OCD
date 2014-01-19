package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfNullableXmls_4 implements
        java.io.Serializable {
    public NullableArrayOfNullableXmls_4(
            final org.w3c.dom.Element[] nullableArrayOfNullableXmls,
            final org.w3c.dom.Element[] calculatedNullableArrayOfNullableXmls,
            final org.w3c.dom.Element[] persistedNullableArrayOfNullableXmls) {
        setNullableArrayOfNullableXmls(nullableArrayOfNullableXmls);
        this.calculatedNullableArrayOfNullableXmls = calculatedNullableArrayOfNullableXmls;
        this.persistedNullableArrayOfNullableXmls = persistedNullableArrayOfNullableXmls;
    }

    public NullableArrayOfNullableXmls_4() {
        this.calculatedNullableArrayOfNullableXmls = null;
        this.persistedNullableArrayOfNullableXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1681822399;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfNullableXmls_4)) return false;
        final NullableArrayOfNullableXmls_4 other = (NullableArrayOfNullableXmls_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfNullableXmls,
                other.nullableArrayOfNullableXmls))) return false;
        if (!(this.calculatedNullableArrayOfNullableXmls == other.calculatedNullableArrayOfNullableXmls || this.calculatedNullableArrayOfNullableXmls != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfNullableXmls,
                        other.calculatedNullableArrayOfNullableXmls)))
            return false;
        if (!(this.persistedNullableArrayOfNullableXmls == other.persistedNullableArrayOfNullableXmls || this.persistedNullableArrayOfNullableXmls != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfNullableXmls,
                        other.persistedNullableArrayOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfNullableXmls_4(" + nullableArrayOfNullableXmls
                + ',' + calculatedNullableArrayOfNullableXmls + ','
                + persistedNullableArrayOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] nullableArrayOfNullableXmls;

    @JsonProperty("nullableArrayOfNullableXmls")
    public org.w3c.dom.Element[] getNullableArrayOfNullableXmls() {
        return nullableArrayOfNullableXmls;
    }

    public NullableArrayOfNullableXmls_4 setNullableArrayOfNullableXmls(
            final org.w3c.dom.Element[] value) {
        this.nullableArrayOfNullableXmls = value;

        return this;
    }

    private final org.w3c.dom.Element[] calculatedNullableArrayOfNullableXmls;

    public org.w3c.dom.Element[] getCalculatedNullableArrayOfNullableXmls() {
        return this.calculatedNullableArrayOfNullableXmls;
    }

    private final org.w3c.dom.Element[] persistedNullableArrayOfNullableXmls;

    public org.w3c.dom.Element[] getPersistedNullableArrayOfNullableXmls() {
        return this.persistedNullableArrayOfNullableXmls;
    }
}
