package com.dslplatform.ocd.calculation.CalculatedPropertyInValueSetup;

import com.fasterxml.jackson.annotation.*;

public final class NullableArrayOfOneXmls_4 implements java.io.Serializable {
    public NullableArrayOfOneXmls_4(
            final org.w3c.dom.Element[] nullableArrayOfOneXmls,
            final org.w3c.dom.Element[] calculatedNullableArrayOfOneXmls,
            final org.w3c.dom.Element[] persistedNullableArrayOfOneXmls) {
        setNullableArrayOfOneXmls(nullableArrayOfOneXmls);
        this.calculatedNullableArrayOfOneXmls = calculatedNullableArrayOfOneXmls;
        this.persistedNullableArrayOfOneXmls = persistedNullableArrayOfOneXmls;
    }

    public NullableArrayOfOneXmls_4() {
        this.calculatedNullableArrayOfOneXmls = null;
        this.persistedNullableArrayOfOneXmls = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2108159014;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableArrayOfOneXmls_4)) return false;
        final NullableArrayOfOneXmls_4 other = (NullableArrayOfOneXmls_4) obj;

        if (!(java.util.Arrays.equals(this.nullableArrayOfOneXmls,
                other.nullableArrayOfOneXmls))) return false;
        if (!(this.calculatedNullableArrayOfOneXmls == other.calculatedNullableArrayOfOneXmls || this.calculatedNullableArrayOfOneXmls != null
                && java.util.Arrays.equals(
                        this.calculatedNullableArrayOfOneXmls,
                        other.calculatedNullableArrayOfOneXmls))) return false;
        if (!(this.persistedNullableArrayOfOneXmls == other.persistedNullableArrayOfOneXmls || this.persistedNullableArrayOfOneXmls != null
                && java.util.Arrays.equals(
                        this.persistedNullableArrayOfOneXmls,
                        other.persistedNullableArrayOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableArrayOfOneXmls_4(" + nullableArrayOfOneXmls + ','
                + calculatedNullableArrayOfOneXmls + ','
                + persistedNullableArrayOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private org.w3c.dom.Element[] nullableArrayOfOneXmls;

    @JsonProperty("nullableArrayOfOneXmls")
    public org.w3c.dom.Element[] getNullableArrayOfOneXmls() {
        return nullableArrayOfOneXmls;
    }

    public NullableArrayOfOneXmls_4 setNullableArrayOfOneXmls(
            final org.w3c.dom.Element[] value) {
        com.dslplatform.ocd.calculation.Guards.checkNulls(value);
        this.nullableArrayOfOneXmls = value;

        return this;
    }

    private final org.w3c.dom.Element[] calculatedNullableArrayOfOneXmls;

    public org.w3c.dom.Element[] getCalculatedNullableArrayOfOneXmls() {
        return this.calculatedNullableArrayOfOneXmls;
    }

    private final org.w3c.dom.Element[] persistedNullableArrayOfOneXmls;

    public org.w3c.dom.Element[] getPersistedNullableArrayOfOneXmls() {
        return this.persistedNullableArrayOfOneXmls;
    }
}
