package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableBinariesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate1A0Bi> aggregate1A0BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableBinariesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate1A0BiRepository.class);
    }

    /* Testing the "p1A0Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi();
        final byte[][] testValue = aggregate.getP1A0Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi();
        final byte[][] testValue = aggregate.getP1A0Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { null };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { null };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0] };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0] };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Bi" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0BiNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Bi" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0BiNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { null, new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate1A0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Bi());
    }

    /* Testing the "p1A0Bi" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1A0BiNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[][] testValue = new byte[][] { null, new byte[0], new byte[] { Byte.MIN_VALUE }, new byte[] { Byte.MIN_VALUE, 0 }, new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE } };
        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate1A0Bi()
                .setP1A0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Bi().getP1A0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate1A0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate1A0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}