package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfOneBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate1A1Bi> aggregate1A1BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfOneBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A1BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate1A1BiRepository.class);
    }

    /* Testing the "p1A1Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi();
        final byte[][] testValue = aggregate.getP1A1Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Bi());
    }

    /* Testing the "p1A1Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP1A1BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi();
        final byte[][] testValue = aggregate.getP1A1Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi().getP1A1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0] };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Bi());
    }

    /* Testing the "p1A1Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A1BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0] };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi().getP1A1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Bi());
    }

    /* Testing the "p1A1Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A1BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi().getP1A1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A1Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A1BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A1Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP1A1Bi());
    }

    /* Testing the "p1A1Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A1BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A1Bi()
                .setP1A1Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregate.getP1A1Bi().getP1A1Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A1Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A1Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfOneEquals(
                testValue,
                aggregateFound.getP1A1Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
