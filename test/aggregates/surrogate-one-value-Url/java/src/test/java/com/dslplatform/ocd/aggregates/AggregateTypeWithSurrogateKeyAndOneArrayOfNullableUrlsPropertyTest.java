package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableUrlsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateUrl.Aggregate1A0Ur> aggregate1A0UrRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableUrlsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0UrRepository = locator.resolve(ocd.AggregateSurrogateUrl.repositories.Aggregate1A0UrRepository.class);
    }

    /* Testing the "p1A0Ur" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0UrDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur();
        final java.net.URI[] testValue = aggregate.getP1A0Ur();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ur());
    }

    /* Testing the "p1A0Ur" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0UrDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur();
        final java.net.URI[] testValue = aggregate.getP1A0Ur();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur().getP1A0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ur" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0UrNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { null };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ur());
    }

    /* Testing the "p1A0Ur" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0UrNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { null };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur().getP1A0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ur" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0UrNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ur());
    }

    /* Testing the "p1A0Ur" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0UrNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur().getP1A0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ur" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0UrNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ur());
    }

    /* Testing the "p1A0Ur" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0UrNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur().getP1A0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Ur" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0UrNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { null, com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateUrl.Aggregate1A0Ur.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Ur());
    }

    /* Testing the "p1A0Ur" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0UrNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.net.URI[] testValue = new java.net.URI[] { null, com.dslplatform.ocd.test.TypeFactory.buildURI("http://127.0.0.1/"), com.dslplatform.ocd.test.TypeFactory.buildURI("http://www.xyz.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://www.abc.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("ftp://www.pqr.com/"), com.dslplatform.ocd.test.TypeFactory.buildURI("https://localhost:8080/"), com.dslplatform.ocd.test.TypeFactory.buildURI("mailto:snail@mail.hu"), com.dslplatform.ocd.test.TypeFactory.buildURI("file:///~/opt/somefile.md"), com.dslplatform.ocd.test.TypeFactory.buildURI("tcp://localhost:8181/"), com.dslplatform.ocd.test.TypeFactory.buildURI("failover:(tcp://localhost:8181,tcp://localhost:8080/)") };
        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregate =
                new ocd.AggregateSurrogateUrl.Aggregate1A0Ur()
                .setP1A0Ur(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Ur().getP1A0Ur());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        final ocd.AggregateSurrogateUrl.Aggregate1A0Ur aggregateFound =
                ocd.AggregateSurrogateUrl.Aggregate1A0Ur.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.UrlAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Ur());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
