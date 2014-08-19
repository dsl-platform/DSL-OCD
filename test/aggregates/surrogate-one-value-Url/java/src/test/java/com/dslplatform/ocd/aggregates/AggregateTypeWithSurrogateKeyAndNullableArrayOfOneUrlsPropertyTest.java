package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneUrlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate0A1Ur> aggregate0A1UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneUrlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate0A1UrRepository.class);
    }

    /* Testing the "p0A1Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur();
        final java.net.URI[] testValue = aggregate.getP0A1Ur();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ur());
    }

    /* Testing the "p0A1Ur" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1UrDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur();
        final java.net.URI[] testValue = aggregate.getP0A1Ur();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur().getP0A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur()
                .setP0A1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ur());
    }

    /* Testing the "p0A1Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur()
                .setP0A1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur().getP0A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur()
                .setP0A1Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate0A1Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Ur());
    }

    /* Testing the "p0A1Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate0A1Ur()
                .setP0A1Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Ur().getP0A1Ur());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate0A1Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate0A1Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
