package com.dslplatform.ocd.aggregates.SetOptBoolInAggregate;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;
import com.fasterxml.jackson.annotation.*;

public class SetOptBoolAggregate implements java.io.Serializable, AggregateRoot {
    public SetOptBoolAggregate() {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.setOptBool = new java.util.HashSet<Boolean>();
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
        final SetOptBoolAggregate other = (SetOptBoolAggregate) obj;

        return URI != null && URI.equals(other.URI);
    }

    @Override
    public String toString() {
        return URI != null
                ? "SetOptBoolAggregate(" + URI + ')'
                : "new SetOptBoolAggregate(" + super.hashCode() + ')';
    }

    private static final long serialVersionUID = 0x0097000a;

    public SetOptBoolAggregate(
            final java.util.Set<Boolean> setOptBool) {
        _serviceLocator = Bootstrap.getLocator();
        _domainProxy = _serviceLocator.resolve(DomainProxy.class);
        _crudProxy = _serviceLocator.resolve(CrudProxy.class);
        setSetOptBool(setOptBool);
    }

    @JsonCreator
    private SetOptBoolAggregate(
            @JacksonInject("_serviceLocator") final ServiceLocator _serviceLocator,
            @JsonProperty("URI") final String URI,
            @JsonProperty("setOptBool") final java.util.Set<Boolean> setOptBool) {
        this._serviceLocator = _serviceLocator;
        this._domainProxy = _serviceLocator.resolve(DomainProxy.class);
        this._crudProxy = _serviceLocator.resolve(CrudProxy.class);
        this.URI = URI;
        this.setOptBool = setOptBool == null
                ? new java.util.HashSet<Boolean>()
                : setOptBool;
    }

    public static SetOptBoolAggregate find(final String uri)
            throws java.io.IOException {
        return find(uri, Bootstrap.getLocator());
    }

    public static SetOptBoolAggregate find(
            final String uri,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(CrudProxy.class)
                    .read(SetOptBoolAggregate.class, uri).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<SetOptBoolAggregate> find(
            final Iterable<String> uris) throws java.io.IOException {
        return find(uris, Bootstrap.getLocator());
    }

    public static java.util.List<SetOptBoolAggregate> find(
            final Iterable<String> uris,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .find(SetOptBoolAggregate.class, uris).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<SetOptBoolAggregate> findAll()
            throws java.io.IOException {
        return findAll(null, null, Bootstrap.getLocator());
    }

    public static java.util.List<SetOptBoolAggregate> findAll(
            final ServiceLocator locator) throws java.io.IOException {
        return findAll(null, null, locator);
    }

    public static java.util.List<SetOptBoolAggregate> findAll(
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return findAll(limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<SetOptBoolAggregate> findAll(
            final Integer limit,
            final Integer offset,
            final ServiceLocator locator) throws java.io.IOException {
        try {
            return (locator != null ? locator : Bootstrap.getLocator())
                    .resolve(DomainProxy.class)
                    .findAll(SetOptBoolAggregate.class, limit, offset, null)
                    .get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static java.util.List<SetOptBoolAggregate> search(
            final Specification<SetOptBoolAggregate> specification)
            throws java.io.IOException {
        return search(specification, null, null, Bootstrap.getLocator());
    }

    public static java.util.List<SetOptBoolAggregate> search(
            final Specification<SetOptBoolAggregate> specification,
            final ServiceLocator locator) throws java.io.IOException {
        return search(specification, null, null, locator);
    }

    public static java.util.List<SetOptBoolAggregate> search(
            final Specification<SetOptBoolAggregate> specification,
            final Integer limit,
            final Integer offset) throws java.io.IOException {
        return search(specification, limit, offset, Bootstrap.getLocator());
    }

    public static java.util.List<SetOptBoolAggregate> search(
            final Specification<SetOptBoolAggregate> specification,
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
                    .count(SetOptBoolAggregate.class).get().longValue();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    public static long count(
            final Specification<SetOptBoolAggregate> specification)
            throws java.io.IOException {
        return count(specification, Bootstrap.getLocator());
    }

    public static long count(
            final Specification<SetOptBoolAggregate> specification,
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
            final com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.SetOptBoolAggregate result) {
        this.URI = result.URI;

        this.setOptBool = result.setOptBool;
    }

    public SetOptBoolAggregate persist() throws java.io.IOException {
        final SetOptBoolAggregate result;
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

    public SetOptBoolAggregate delete() throws java.io.IOException {
        try {
            return _crudProxy.delete(SetOptBoolAggregate.class, URI).get();
        } catch (final InterruptedException e) {
            throw new java.io.IOException(e);
        } catch (final java.util.concurrent.ExecutionException e) {
            throw new java.io.IOException(e);
        }
    }

    private java.util.Set<Boolean> setOptBool;

    @JsonProperty("setOptBool")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public java.util.Set<Boolean> getSetOptBool() {
        return setOptBool;
    }

    public SetOptBoolAggregate setSetOptBool(final java.util.Set<Boolean> value) {
        if (value == null)
            throw new IllegalArgumentException(
                    "Property \"setOptBool\" cannot be null!");
        this.setOptBool = value;

        return this;
    }
}
