package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneBinaryPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate1Bi> aggregate1BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneBinaryPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate1BiRepository.class);
    }

    /* Testing the "p1Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi();
        final byte[] testValue = aggregate.getP1Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bi());
    }

    /* Testing the "p1Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP1BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi();
        final byte[] testValue = aggregate.getP1Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi().getP1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bi());
    }

    /* Testing the "p1Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi().getP1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0 };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bi());
    }

    /* Testing the "p1Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0 };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi().getP1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateDeserialized.getP1Bi());
    }

    /* Testing the "p1Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1Bi()
                .setP1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregate.getP1Bi().getP1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneEquals(
                testValue,
                aggregateFound.getP1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
