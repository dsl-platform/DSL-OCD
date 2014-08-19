package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneIntegerPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateInteger.Aggregate1In> aggregate1InRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneIntegerPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1InRepository = locator.resolve(ocd.AggregateSurrogateInteger.repositories.Aggregate1InRepository.class);
    }

    /* Testing the "p1In" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1InDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In();
        final int testValue = aggregate.getP1In();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1In());
    }

    /* Testing the "p1In" Default property value after active record persist */
    @org.junit.Test
    public void testP1InDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In();
        final int testValue = aggregate.getP1In();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In().getP1In());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1In" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1InNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final int testValue = Integer.MIN_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1In());
    }

    /* Testing the "p1In" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1InNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final int testValue = Integer.MIN_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In().getP1In());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1In" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1InNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final int testValue = Integer.MAX_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1In());
    }

    /* Testing the "p1In" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1InNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final int testValue = Integer.MAX_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In().getP1In());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1In" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1InNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final int testValue = -1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1In());
    }

    /* Testing the "p1In" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1InNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final int testValue = -1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In().getP1In());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1In" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1InNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final int testValue = 1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate1In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1In());
    }

    /* Testing the "p1In" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1InNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final int testValue = 1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate1In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate1In()
                .setP1In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregate.getP1In().getP1In());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate1In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate1In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
