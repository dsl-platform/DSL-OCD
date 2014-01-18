package com.dslplatform.ocd.values.PropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableListOfOneXmls_1 implements java.io.Serializable {
    public NullableListOfOneXmls_1(
            final java.util.List<org.w3c.dom.Element> nullableListOfOneXmls) {
        setNullableListOfOneXmls(nullableListOfOneXmls);
    }

    public NullableListOfOneXmls_1() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 404757768;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableListOfOneXmls_1)) return false;
        final NullableListOfOneXmls_1 other = (NullableListOfOneXmls_1) obj;

        if (!(this.nullableListOfOneXmls == other.nullableListOfOneXmls || this.nullableListOfOneXmls != null
                && this.nullableListOfOneXmls
                        .equals(other.nullableListOfOneXmls))) return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableListOfOneXmls_1(" + nullableListOfOneXmls + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.List<org.w3c.dom.Element> nullableListOfOneXmls;

    @JsonProperty("nullableListOfOneXmls")
    public java.util.List<org.w3c.dom.Element> getNullableListOfOneXmls() {
        return nullableListOfOneXmls;
    }

    public NullableListOfOneXmls_1 setNullableListOfOneXmls(
            final java.util.List<org.w3c.dom.Element> value) {
        com.dslplatform.ocd.values.Guards.checkNulls(value);
        this.nullableListOfOneXmls = value;

        return this;
    }
}
