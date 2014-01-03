package model.CalculatedTestsDouble;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestDouble implements java.io.Serializable, AggregateRoot {
    public TestDouble() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalDouble = 0.0;
        this.calculatedStringFromDouble = "";
        this.calculatedIntFromDouble = 0;
        this.calculatedFloatFromDouble = 0.0f;
        this.calculatedLongFromDouble = 0L;
        this.calculatedDecimalFromDouble = java.math.BigDecimal.ZERO;
        this.calculatedMoneyFromDouble = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedBooleanFromDouble = false;
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
        final TestDouble other = (TestDouble) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestDouble(" + URI + ')' : "new TestDouble("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestDouble(
            final double originalDouble) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalDouble(originalDouble);
    }

    @JsonCreator
    private TestDouble(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalDouble") final double originalDouble,
            @JsonProperty("calculatedStringFromDouble") final String calculatedStringFromDouble,
            @JsonProperty("calculatedIntFromDouble") final int calculatedIntFromDouble,
            @JsonProperty("calculatedFloatFromDouble") final float calculatedFloatFromDouble,
            @JsonProperty("calculatedLongFromDouble") final long calculatedLongFromDouble,
            @JsonProperty("calculatedDecimalFromDouble") final java.math.BigDecimal calculatedDecimalFromDouble,
            @JsonProperty("calculatedMoneyFromDouble") final java.math.BigDecimal calculatedMoneyFromDouble,
            @JsonProperty("calculatedBooleanFromDouble") final boolean calculatedBooleanFromDouble) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalDouble = originalDouble;
        this.calculatedStringFromDouble = calculatedStringFromDouble;
        this.calculatedIntFromDouble = calculatedIntFromDouble;
        this.calculatedFloatFromDouble = calculatedFloatFromDouble;
        this.calculatedLongFromDouble = calculatedLongFromDouble;
        this.calculatedDecimalFromDouble = calculatedDecimalFromDouble;
        this.calculatedMoneyFromDouble = calculatedMoneyFromDouble;
        this.calculatedBooleanFromDouble = calculatedBooleanFromDouble;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestDouble setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestDouble find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestDouble find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestDouble.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDouble> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestDouble> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestDouble.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDouble> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestDouble> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestDouble> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestDouble> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestDouble.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDouble> search(
            final Specification<TestDouble> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestDouble> search(
            final Specification<TestDouble> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestDouble> search(
            final Specification<TestDouble> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestDouble> search(
            final Specification<TestDouble> specification,
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
                    .resolve(DomainProxy.class).count(TestDouble.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestDouble> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestDouble> specification,
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
            final model.CalculatedTestsDouble.TestDouble result) {
        this.URI = result.URI;

        this.originalDouble = result.originalDouble;
        this.calculatedStringFromDouble = result.calculatedStringFromDouble;
        this.calculatedIntFromDouble = result.calculatedIntFromDouble;
        this.calculatedFloatFromDouble = result.calculatedFloatFromDouble;
        this.calculatedLongFromDouble = result.calculatedLongFromDouble;
        this.calculatedDecimalFromDouble = result.calculatedDecimalFromDouble;
        this.calculatedMoneyFromDouble = result.calculatedMoneyFromDouble;
        this.calculatedBooleanFromDouble = result.calculatedBooleanFromDouble;
        this.ID = result.ID;
    }

    public TestDouble persist() throws java.io.IOException {
        final TestDouble result;
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

    public TestDouble delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestDouble.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private double originalDouble;

    @JsonProperty("originalDouble")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public double getOriginalDouble() {
        return originalDouble;
    }

    public TestDouble setOriginalDouble(final double value) {
        this.originalDouble = value;

        return this;
    }

    private String calculatedStringFromDouble;

    @JsonProperty("calculatedStringFromDouble")
    public String getCalculatedStringFromDouble() {
        return this.calculatedStringFromDouble;
    }

    private int calculatedIntFromDouble;

    @JsonProperty("calculatedIntFromDouble")
    public int getCalculatedIntFromDouble() {
        return this.calculatedIntFromDouble;
    }

    private float calculatedFloatFromDouble;

    @JsonProperty("calculatedFloatFromDouble")
    public float getCalculatedFloatFromDouble() {
        return this.calculatedFloatFromDouble;
    }

    private long calculatedLongFromDouble;

    @JsonProperty("calculatedLongFromDouble")
    public long getCalculatedLongFromDouble() {
        return this.calculatedLongFromDouble;
    }

    private java.math.BigDecimal calculatedDecimalFromDouble;

    @JsonProperty("calculatedDecimalFromDouble")
    public java.math.BigDecimal getCalculatedDecimalFromDouble() {
        return this.calculatedDecimalFromDouble;
    }

    private java.math.BigDecimal calculatedMoneyFromDouble;

    @JsonProperty("calculatedMoneyFromDouble")
    public java.math.BigDecimal getCalculatedMoneyFromDouble() {
        return this.calculatedMoneyFromDouble;
    }

    private boolean calculatedBooleanFromDouble;

    @JsonProperty("calculatedBooleanFromDouble")
    public boolean getCalculatedBooleanFromDouble() {
        return this.calculatedBooleanFromDouble;
    }
}
