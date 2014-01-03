package model.CalculatedTestsLong;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestLong implements java.io.Serializable, AggregateRoot {
    public TestLong() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalLong = 0L;
        this.calculatedStringFromLong = "";
        this.calculatedIntFromLong = 0;
        this.calculatedDoubleFromLong = 0.0;
        this.calculatedFloatFromLong = 0.0f;
        this.calculatedDecimalFromLong = java.math.BigDecimal.ZERO;
        this.calculatedMoneyFromLong = java.math.BigDecimal.ZERO.setScale(2);
        this.calculatedBooleanFromLong = false;
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
        final TestLong other = (TestLong) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestLong(" + URI + ')' : "new TestLong("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestLong(
            final long originalLong) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalLong(originalLong);
    }

    @JsonCreator
    private TestLong(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalLong") final long originalLong,
            @JsonProperty("calculatedStringFromLong") final String calculatedStringFromLong,
            @JsonProperty("calculatedIntFromLong") final int calculatedIntFromLong,
            @JsonProperty("calculatedDoubleFromLong") final double calculatedDoubleFromLong,
            @JsonProperty("calculatedFloatFromLong") final float calculatedFloatFromLong,
            @JsonProperty("calculatedDecimalFromLong") final java.math.BigDecimal calculatedDecimalFromLong,
            @JsonProperty("calculatedMoneyFromLong") final java.math.BigDecimal calculatedMoneyFromLong,
            @JsonProperty("calculatedBooleanFromLong") final boolean calculatedBooleanFromLong) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalLong = originalLong;
        this.calculatedStringFromLong = calculatedStringFromLong;
        this.calculatedIntFromLong = calculatedIntFromLong;
        this.calculatedDoubleFromLong = calculatedDoubleFromLong;
        this.calculatedFloatFromLong = calculatedFloatFromLong;
        this.calculatedDecimalFromLong = calculatedDecimalFromLong;
        this.calculatedMoneyFromLong = calculatedMoneyFromLong;
        this.calculatedBooleanFromLong = calculatedBooleanFromLong;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestLong setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestLong find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestLong find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestLong.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestLong> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestLong> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestLong.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestLong> findAll() throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestLong> findAll(final ServiceLocator locator)
            throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestLong> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestLong> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestLong.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestLong> search(
            final Specification<TestLong> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestLong> search(
            final Specification<TestLong> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestLong> search(
            final Specification<TestLong> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestLong> search(
            final Specification<TestLong> specification,
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
                    .resolve(DomainProxy.class).count(TestLong.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestLong> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestLong> specification,
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
            final model.CalculatedTestsLong.TestLong result) {
        this.URI = result.URI;

        this.originalLong = result.originalLong;
        this.calculatedStringFromLong = result.calculatedStringFromLong;
        this.calculatedIntFromLong = result.calculatedIntFromLong;
        this.calculatedDoubleFromLong = result.calculatedDoubleFromLong;
        this.calculatedFloatFromLong = result.calculatedFloatFromLong;
        this.calculatedDecimalFromLong = result.calculatedDecimalFromLong;
        this.calculatedMoneyFromLong = result.calculatedMoneyFromLong;
        this.calculatedBooleanFromLong = result.calculatedBooleanFromLong;
        this.ID = result.ID;
    }

    public TestLong persist() throws java.io.IOException {
        final TestLong result;
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

    public TestLong delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestLong.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private long originalLong;

    @JsonProperty("originalLong")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public long getOriginalLong() {
        return originalLong;
    }

    public TestLong setOriginalLong(final long value) {
        this.originalLong = value;

        return this;
    }

    private String calculatedStringFromLong;

    @JsonProperty("calculatedStringFromLong")
    public String getCalculatedStringFromLong() {
        return this.calculatedStringFromLong;
    }

    private int calculatedIntFromLong;

    @JsonProperty("calculatedIntFromLong")
    public int getCalculatedIntFromLong() {
        return this.calculatedIntFromLong;
    }

    private double calculatedDoubleFromLong;

    @JsonProperty("calculatedDoubleFromLong")
    public double getCalculatedDoubleFromLong() {
        return this.calculatedDoubleFromLong;
    }

    private float calculatedFloatFromLong;

    @JsonProperty("calculatedFloatFromLong")
    public float getCalculatedFloatFromLong() {
        return this.calculatedFloatFromLong;
    }

    private java.math.BigDecimal calculatedDecimalFromLong;

    @JsonProperty("calculatedDecimalFromLong")
    public java.math.BigDecimal getCalculatedDecimalFromLong() {
        return this.calculatedDecimalFromLong;
    }

    private java.math.BigDecimal calculatedMoneyFromLong;

    @JsonProperty("calculatedMoneyFromLong")
    public java.math.BigDecimal getCalculatedMoneyFromLong() {
        return this.calculatedMoneyFromLong;
    }

    private boolean calculatedBooleanFromLong;

    @JsonProperty("calculatedBooleanFromLong")
    public boolean getCalculatedBooleanFromLong() {
        return this.calculatedBooleanFromLong;
    }
}
