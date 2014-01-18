package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class OneListOfNullableStringsWithMaxLengthOf9_2 implements
        java.io.Serializable, AggregateRoot {
    public OneListOfNullableStringsWithMaxLengthOf9_2() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.oneListOfNullableStringsWithMaxLengthOf9 = new java.util.ArrayList<String>();
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
        final OneListOfNullableStringsWithMaxLengthOf9_2 other = (OneListOfNullableStringsWithMaxLengthOf9_2) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null ? "OneListOfNullableStringsWithMaxLengthOf9_2("
                + URI + ')' : "new OneListOfNullableStringsWithMaxLengthOf9_2("
                + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public OneListOfNullableStringsWithMaxLengthOf9_2(
            final java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setOneListOfNullableStringsWithMaxLengthOf9(oneListOfNullableStringsWithMaxLengthOf9);
    }

    @JsonCreator
    private OneListOfNullableStringsWithMaxLengthOf9_2(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("oneListOfNullableStringsWithMaxLengthOf9") final java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.oneListOfNullableStringsWithMaxLengthOf9 = oneListOfNullableStringsWithMaxLengthOf9 == null
                ? new java.util.ArrayList<String>()
                : oneListOfNullableStringsWithMaxLengthOf9;
    }

    public static OneListOfNullableStringsWithMaxLengthOf9_2 find(
            final String uri) throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static OneListOfNullableStringsWithMaxLengthOf9_2 find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(OneListOfNullableStringsWithMaxLengthOf9_2.class, uri)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(OneListOfNullableStringsWithMaxLengthOf9_2.class,
                            uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(OneListOfNullableStringsWithMaxLengthOf9_2.class,
                            limit, offset, null).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> search(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> search(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> search(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<OneListOfNullableStringsWithMaxLengthOf9_2> search(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification,
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
                    .count(OneListOfNullableStringsWithMaxLengthOf9_2.class)
                    .get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<OneListOfNullableStringsWithMaxLengthOf9_2> specification,
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
            final com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableStringsWithMaxLengthOf9_2 result) {
        this.URI = result.URI;

        this.oneListOfNullableStringsWithMaxLengthOf9 = result.oneListOfNullableStringsWithMaxLengthOf9;
    }

    public OneListOfNullableStringsWithMaxLengthOf9_2 persist()
            throws java.io.IOException {
        final OneListOfNullableStringsWithMaxLengthOf9_2 result;
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

    public OneListOfNullableStringsWithMaxLengthOf9_2 delete()
            throws java.io.IOException {
        try {
            return _crudProxy.delete(
                    OneListOfNullableStringsWithMaxLengthOf9_2.class, URI)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.List<String> oneListOfNullableStringsWithMaxLengthOf9;

    @JsonProperty("oneListOfNullableStringsWithMaxLengthOf9")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.List<String> getOneListOfNullableStringsWithMaxLengthOf9() {
        return oneListOfNullableStringsWithMaxLengthOf9;
    }

    public OneListOfNullableStringsWithMaxLengthOf9_2 setOneListOfNullableStringsWithMaxLengthOf9(
            final java.util.List<String> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"oneListOfNullableStringsWithMaxLengthOf9\" cannot be null!");
        com.dslplatform.ocd.aggregates.Guards.checkLength(value, 9);
        this.oneListOfNullableStringsWithMaxLengthOf9 = value;

        return this;
    }
}
