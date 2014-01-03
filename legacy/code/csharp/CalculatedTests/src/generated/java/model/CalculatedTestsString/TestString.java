package model.CalculatedTestsString;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestString implements java.io.Serializable, AggregateRoot {
    public TestString() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalString = "";
        this.calculatedIntFromString = 0;
        this.calculatedLongFromString = 0L;
        this.calculatedDoubleFromString = 0.0;
        this.calculatedFloatFromString = 0.0f;
        this.calculatedDecimalFromString = java.math.BigDecimal.ZERO;
        this.calculatedMoneyFromString = java.math.BigDecimal.ZERO.setScale(2);
    }

    private transient final ServiceLocator _serviceLocator;
    private transient final DomainProxy _domainProxy;
    private transient final CrudProxy _crudProxy;

    private String URI;

    @JsonProperty("URI")
    public String getURI() {
        return this.URI;
    }

    @Override
    public int hashCode() {
        return URI != null ? URI.hashCode() : super.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;
        final TestString other = (TestString) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestString(" + URI + ')' : "new TestString("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestString(
            final String originalString) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalString(originalString);
    }

    @JsonCreator
    private TestString(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalString") final String originalString,
            @JsonProperty("calculatedIntFromString") final int calculatedIntFromString,
            @JsonProperty("calculatedLongFromString") final long calculatedLongFromString,
            @JsonProperty("calculatedDoubleFromString") final double calculatedDoubleFromString,
            @JsonProperty("calculatedFloatFromString") final float calculatedFloatFromString,
            @JsonProperty("calculatedDecimalFromString") final java.math.BigDecimal calculatedDecimalFromString,
            @JsonProperty("calculatedMoneyFromString") final java.math.BigDecimal calculatedMoneyFromString,
            @JsonProperty("calculatedBooleanFromString") final Boolean calculatedBooleanFromString) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalString = originalString == null ? "" : originalString;
        this.calculatedIntFromString = calculatedIntFromString;
        this.calculatedLongFromString = calculatedLongFromString;
        this.calculatedDoubleFromString = calculatedDoubleFromString;
        this.calculatedFloatFromString = calculatedFloatFromString;
        this.calculatedDecimalFromString = calculatedDecimalFromString;
        this.calculatedMoneyFromString = calculatedMoneyFromString;
        this.calculatedBooleanFromString = calculatedBooleanFromString == null
                ? Boolean.FALSE
                : calculatedBooleanFromString;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestString setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestString find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestString find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestString.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestString> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestString> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestString.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestString> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestString> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestString> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestString> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestString.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestString> search(
            final Specification<TestString> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestString> search(
            final Specification<TestString> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestString> search(
            final Specification<TestString> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestString> search(
            final Specification<TestString> specification,
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .search(specification, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count() throws java.io.IOException {
        return count(Bootstrap.getLocator());
    }

    public static long count(final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(TestString.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestString> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestString> specification,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).count(specification).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private void updateWithAnother(
            final model.CalculatedTestsString.TestString result) {
        this.URI = result.URI;

        this.originalString = result.originalString;
        this.calculatedIntFromString = result.calculatedIntFromString;
        this.calculatedLongFromString = result.calculatedLongFromString;
        this.calculatedDoubleFromString = result.calculatedDoubleFromString;
        this.calculatedFloatFromString = result.calculatedFloatFromString;
        this.calculatedDecimalFromString = result.calculatedDecimalFromString;
        this.calculatedMoneyFromString = result.calculatedMoneyFromString;
        this.calculatedBooleanFromString = result.calculatedBooleanFromString;
        this.ID = result.ID;
    }

    public TestString persist() throws java.io.IOException {
        final TestString result;
        try {
            result = this.URI == null
                    ? _crudProxy.create(this).get()
                    : _crudProxy.update(this).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
        this.updateWithAnother(result);
        return this;
    }

    public TestString delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestString.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private String originalString;

    @JsonProperty("originalString")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String getOriginalString() {
        return originalString;
    }

    public TestString setOriginalString(final String value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalString\" cannot be null!");
        this.originalString = value;

        return this;
    }

    private int calculatedIntFromString;

    @JsonProperty("calculatedIntFromString")
    public int getCalculatedIntFromString() {
        return this.calculatedIntFromString;
    }

    private long calculatedLongFromString;

    @JsonProperty("calculatedLongFromString")
    public long getCalculatedLongFromString() {
        return this.calculatedLongFromString;
    }

    private double calculatedDoubleFromString;

    @JsonProperty("calculatedDoubleFromString")
    public double getCalculatedDoubleFromString() {
        return this.calculatedDoubleFromString;
    }

    private float calculatedFloatFromString;

    @JsonProperty("calculatedFloatFromString")
    public float getCalculatedFloatFromString() {
        return this.calculatedFloatFromString;
    }

    private java.math.BigDecimal calculatedDecimalFromString;

    @JsonProperty("calculatedDecimalFromString")
    public java.math.BigDecimal getCalculatedDecimalFromString() {
        return this.calculatedDecimalFromString;
    }

    private java.math.BigDecimal calculatedMoneyFromString;

    @JsonProperty("calculatedMoneyFromString")
    public java.math.BigDecimal getCalculatedMoneyFromString() {
        return this.calculatedMoneyFromString;
    }

    private Boolean calculatedBooleanFromString;

    @JsonProperty("calculatedBooleanFromString")
    public Boolean getCalculatedBooleanFromString() {
        return this.calculatedBooleanFromString;
    }
}
