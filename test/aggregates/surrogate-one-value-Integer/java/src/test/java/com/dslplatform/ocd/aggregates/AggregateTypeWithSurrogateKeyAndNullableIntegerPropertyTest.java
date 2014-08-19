package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableIntegerPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateInteger.Aggregate0In> aggregate0InRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableIntegerPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0InRepository = locator.resolve(ocd.AggregateSurrogateInteger.repositories.Aggregate0InRepository.class);
    }

    /* Testing the "p0In" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In();
        final Integer testValue = aggregate.getP0In();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" Default property value after active record persist */
    @org.junit.Test
    public void testP0InDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In();
        final Integer testValue = aggregate.getP0In();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0In" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer testValue = 0;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0InNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer testValue = 0;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0In" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer testValue = Integer.MIN_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0InNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer testValue = Integer.MIN_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0In" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer testValue = Integer.MAX_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0InNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer testValue = Integer.MAX_VALUE;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0In" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer testValue = -1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0InNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer testValue = -1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0In" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0InNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Integer testValue = 1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateInteger.Aggregate0In.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0In());
    }

    /* Testing the "p0In" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0InNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Integer testValue = 1000000000;
        final ocd.AggregateSurrogateInteger.Aggregate0In aggregate =
                new ocd.AggregateSurrogateInteger.Aggregate0In()
                .setP0In(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0In().getP0In());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        final ocd.AggregateSurrogateInteger.Aggregate0In aggregateFound =
                ocd.AggregateSurrogateInteger.Aggregate0In.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.IntegerAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0In());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
