package model.OptSetOptBoolInValue;

public final class OptSetOptBoolValue implements java.io.Serializable {
    public OptSetOptBoolValue(
            final java.util.Set<Boolean> optSetOptBool) {
        setOptSetOptBool(optSetOptBool);
    }

    public OptSetOptBoolValue() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 1243169305;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(obj instanceof OptSetOptBoolValue)) return false;
        final OptSetOptBoolValue other = (OptSetOptBoolValue) obj;

        if (!(this.optSetOptBool == other.optSetOptBool || this.optSetOptBool != null
                && this.optSetOptBool.equals(other.optSetOptBool)))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "OptSetOptBoolValue(" + optSetOptBool + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    private java.util.Set<Boolean> optSetOptBool;

    public java.util.Set<Boolean> getOptSetOptBool() {
        return optSetOptBool;
    }

    public OptSetOptBoolValue setOptSetOptBool(
            final java.util.Set<Boolean> value) {
        this.optSetOptBool = value;

        return this;
    }
}
