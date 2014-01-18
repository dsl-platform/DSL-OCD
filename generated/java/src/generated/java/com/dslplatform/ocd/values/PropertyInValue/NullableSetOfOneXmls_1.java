package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfOneXmls_1 implements java.io.Serializable {
    public NullableSetOfOneXmls_1(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls) {
        setNullableSetOfOneXmls(nullableSetOfOneXmls);
    }

    public NullableSetOfOneXmls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 2005605326;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfOneXmls_1)) return false;
        final NullableSetOfOneXmls_1 other = (NullableSetOfOneXmls_1) obj;

        if (!(this.nullableSetOfOneXmls == other.nullableSetOfOneXmls || this.nullableSetOfOneXmls != null
                && this.nullableSetOfOneXmls.equals(other.nullableSetOfOneXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfOneXmls_1(" + nullableSetOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> nullableSetOfOneXmls;

    @JsonProperty("nullableSetOfOneXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfOneXmls() {
        return nullableSetOfOneXmls;
    }

    public NullableSetOfOneXmls_1 setNullableSetOfOneXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableSetOfOneXmls = value;

        return this;
    }
}
