package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableXmls_1 implements java.io.Serializable {
    public NullableSetOfNullableXmls_1(
            final java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls) {
        setNullableSetOfNullableXmls(nullableSetOfNullableXmls);
    }

    public NullableSetOfNullableXmls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1453234717;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableXmls_1)) return false;
        final NullableSetOfNullableXmls_1 other = (NullableSetOfNullableXmls_1) obj;

        if (!(this.nullableSetOfNullableXmls == other.nullableSetOfNullableXmls || this.nullableSetOfNullableXmls != null
                && this.nullableSetOfNullableXmls
                        .equals(other.nullableSetOfNullableXmls)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableXmls_1(" + nullableSetOfNullableXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<org.w3c.dom.Element> nullableSetOfNullableXmls;

    @JsonProperty("nullableSetOfNullableXmls")
    public java.util.Set<org.w3c.dom.Element> getNullableSetOfNullableXmls() {
        return nullableSetOfNullableXmls;
    }

    public NullableSetOfNullableXmls_1 setNullableSetOfNullableXmls(
            final java.util.Set<org.w3c.dom.Element> value) {
        this.nullableSetOfNullableXmls = value;

        return this;
    }
}
