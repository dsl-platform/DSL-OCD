package com.dslplatform.ocd.values.SinglePropertyInValue;

import com.fasterxml.jackson.annotation.*;

public final class NullableSetOfNullableBooleansValue5 implements
        java.io.Serializable {
    public NullableSetOfNullableBooleansValue5(
            final java.util.Set<Boolean> nullableSetOfNullableBooleans) {
        setNullableSetOfNullableBooleans(nullableSetOfNullableBooleans);
    }

    public NullableSetOfNullableBooleansValue5() {}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 899819080;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof NullableSetOfNullableBooleansValue5))
            return false;
        final NullableSetOfNullableBooleansValue5 other = (NullableSetOfNullableBooleansValue5) obj;

        if (!(this.nullableSetOfNullableBooleans == other.nullableSetOfNullableBooleans || this.nullableSetOfNullableBooleans != null
                && this.nullableSetOfNullableBooleans
                        .equals(other.nullableSetOfNullableBooleans)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "NullableSetOfNullableBooleansValue5("
                + nullableSetOfNullableBooleans + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> nullableSetOfNullableBooleans;

    @JsonProperty("nullableSetOfNullableBooleans")
    public java.util.Set<Boolean> getNullableSetOfNullableBooleans() {
        return nullableSetOfNullableBooleans;
    }

    public NullableSetOfNullableBooleansValue5 setNullableSetOfNullableBooleans(
            final java.util.Set<Boolean> value) {
        this.nullableSetOfNullableBooleans = value;

        return this;
    }
}
