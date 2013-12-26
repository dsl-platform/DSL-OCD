package model.CalculatedTestsDate;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class TestDate implements java.io.Serializable, AggregateRoot {
    public TestDate() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.originalDate = new org.joda.time.LocalDate();
        this.originalTimestamp = new org.joda.time.DateTime();
        this.calculatedTimestampFromDate = new org.joda.time.DateTime();
        this.calculatedDateFromTimestamp = new org.joda.time.LocalDate();
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
        final TestDate other = (TestDate) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "TestDate(" + URI + ')' : "new TestDate("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public TestDate(
            final org.joda.time.LocalDate originalDate,
            final org.joda.time.DateTime originalTimestamp) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOriginalDate(originalDate);
        setOriginalTimestamp(originalTimestamp);
    }

    @JsonCreator
    private TestDate(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("originalDate") final org.joda.time.LocalDate originalDate,
            @JsonProperty("originalTimestamp") final org.joda.time.DateTime originalTimestamp,
            @JsonProperty("calculatedTimestampFromDate") final org.joda.time.DateTime calculatedTimestampFromDate,
            @JsonProperty("calculatedDateFromTimestamp") final org.joda.time.LocalDate calculatedDateFromTimestamp) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.originalDate = originalDate == null
                ? new org.joda.time.LocalDate()
                : originalDate;
        this.originalTimestamp = originalTimestamp == null
                ? new org.joda.time.DateTime()
                : originalTimestamp;
        this.calculatedTimestampFromDate = calculatedTimestampFromDate;
        this.calculatedDateFromTimestamp = calculatedDateFromTimestamp;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private TestDate setID(final int value) {
        this.ID = value;

        return this;
    }

    public static TestDate find(final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static TestDate find(final String uri, final ServiceLocator locator)
            throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class).read(TestDate.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDate> find(final Iterable<String> uris)
            throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<TestDate> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class).find(TestDate.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDate> findAll() throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestDate> findAll(final ServiceLocator locator)
            throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<TestDate> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestDate> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(TestDate.class, limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<TestDate> search(
            final Specification<TestDate> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<TestDate> search(
            final Specification<TestDate> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<TestDate> search(
            final Specification<TestDate> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<TestDate> search(
            final Specification<TestDate> specification,
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
                    .resolve(DomainProxy.class).count(TestDate.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(final Specification<TestDate> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<TestDate> specification,
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
            final model.CalculatedTestsDate.TestDate result) {
        this.URI = result.URI;

        this.originalDate = result.originalDate;
        this.originalTimestamp = result.originalTimestamp;
        this.calculatedTimestampFromDate = result.calculatedTimestampFromDate;
        this.calculatedDateFromTimestamp = result.calculatedDateFromTimestamp;
        this.ID = result.ID;
    }

    public TestDate persist() throws java.io.IOException {
        final TestDate result;
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

    public TestDate delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(TestDate.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private org.joda.time.LocalDate originalDate;

    @JsonProperty("originalDate")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.LocalDate getOriginalDate() {
        return originalDate;
    }

    public TestDate setOriginalDate(final org.joda.time.LocalDate value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalDate\" cannot be null!");
        this.originalDate = value;

        return this;
    }

    private org.joda.time.DateTime originalTimestamp;

    @JsonProperty("originalTimestamp")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public org.joda.time.DateTime getOriginalTimestamp() {
        return originalTimestamp;
    }

    public TestDate setOriginalTimestamp(final org.joda.time.DateTime value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"originalTimestamp\" cannot be null!");
        this.originalTimestamp = value;

        return this;
    }

    private org.joda.time.DateTime calculatedTimestampFromDate;

    @JsonProperty("calculatedTimestampFromDate")
    public org.joda.time.DateTime getCalculatedTimestampFromDate() {
        return this.calculatedTimestampFromDate;
    }

    private org.joda.time.LocalDate calculatedDateFromTimestamp;

    @JsonProperty("calculatedDateFromTimestamp")
    public org.joda.time.LocalDate getCalculatedDateFromTimestamp() {
        return this.calculatedDateFromTimestamp;
    }
}
