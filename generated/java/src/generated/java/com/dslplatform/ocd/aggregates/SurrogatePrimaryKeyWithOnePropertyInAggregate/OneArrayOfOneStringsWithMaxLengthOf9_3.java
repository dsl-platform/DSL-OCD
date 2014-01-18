package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneArrayOfOneStringsWithMaxLengthOf9_3 implements
        java.io.Serializable, AggregateRoot {
    public OneArrayOfOneStringsWithMaxLengthOf9_3() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.ID = 0;
        this.oneArrayOfOneStringsWithMaxLengthOf9 = new String[] {};
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
        final OneArrayOfOneStringsWithMaxLengthOf9_3 other = (OneArrayOfOneStringsWithMaxLengthOf9_3) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "OneArrayOfOneStringsWithMaxLengthOf9_3(" + URI
                + ')' : "new OneArrayOfOneStringsWithMaxLengthOf9_3("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneArrayOfOneStringsWithMaxLengthOf9_3(
            final String[] oneArrayOfOneStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneArrayOfOneStringsWithMaxLengthOf9(oneArrayOfOneStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private OneArrayOfOneStringsWithMaxLengthOf9_3(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("ID") final int ID,
            @JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9") final String[] oneArrayOfOneStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.ID = ID;
        this.oneArrayOfOneStringsWithMaxLengthOf9 = oneArrayOfOneStringsWithMaxLengthOf9 == null
                ? new String[] {}
                : oneArrayOfOneStringsWithMaxLengthOf9;
    }

    private int ID;

    @JsonProperty("ID")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public int getID() {
        return ID;
    }

    private OneArrayOfOneStringsWithMaxLengthOf9_3 setID(final int value) {
        this.ID = value;

        return this;
    }

    public static OneArrayOfOneStringsWithMaxLengthOf9_3 find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneArrayOfOneStringsWithMaxLengthOf9_3 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneArrayOfOneStringsWithMaxLengthOf9_3.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneArrayOfOneStringsWithMaxLengthOf9_3.class, uris)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneArrayOfOneStringsWithMaxLengthOf9_3.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneArrayOfOneStringsWithMaxLengthOf9_3> search(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification,
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
                    .resolve(DomainProxy.class)
                    .count(OneArrayOfOneStringsWithMaxLengthOf9_3.class).get()
                    .longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneArrayOfOneStringsWithMaxLengthOf9_3> specification,
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
            final com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneArrayOfOneStringsWithMaxLengthOf9_3 result) {
        this.URI = result.URI;

        this.oneArrayOfOneStringsWithMaxLengthOf9 = result.oneArrayOfOneStringsWithMaxLengthOf9;
        this.ID = result.ID;
    }

    public OneArrayOfOneStringsWithMaxLengthOf9_3 persist()
            throws java.io.IOException {
        final OneArrayOfOneStringsWithMaxLengthOf9_3 result;
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

    public OneArrayOfOneStringsWithMaxLengthOf9_3 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    OneArrayOfOneStringsWithMaxLengthOf9_3.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private String[] oneArrayOfOneStringsWithMaxLengthOf9;

    @JsonProperty("oneArrayOfOneStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String[] getOneArrayOfOneStringsWithMaxLengthOf9() {
        return oneArrayOfOneStringsWithMaxLengthOf9;
    }

    public OneArrayOfOneStringsWithMaxLengthOf9_3 setOneArrayOfOneStringsWithMaxLengthOf9(
            final String[] value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneArrayOfOneStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.aggregates.Guards.checkNulls(value);
        com.dslplatform.ocd.aggregates.Guards.checkLength(value, 9);
        this.oneArrayOfOneStringsWithMaxLengthOf9 = value;

        return this;
    }
}
