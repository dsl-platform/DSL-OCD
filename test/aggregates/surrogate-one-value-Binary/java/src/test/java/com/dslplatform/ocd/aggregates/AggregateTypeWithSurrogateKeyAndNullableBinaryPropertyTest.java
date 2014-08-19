package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableBinaryPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateBinary.Aggregate0Bi> aggregate0BiRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableBinaryPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0BiRepository = locator.resolve(ocd.AggregateSurrogateBinary.repositories.Aggregate0BiRepository.class);
    }

    /* Testing the "p0Bi" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BiDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi();
        final byte[] testValue = aggregate.getP0Bi();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bi());
    }

    /* Testing the "p0Bi" Default property value after active record persist */
    @org.junit.Test
    public void testP0BiDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi();
        final byte[] testValue = aggregate.getP0Bi();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi().getP0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bi" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BiNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[0];
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bi());
    }

    /* Testing the "p0Bi" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0BiNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[0];
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi().getP0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bi" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BiNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bi());
    }

    /* Testing the "p0Bi" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0BiNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi().getP0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bi" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BiNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0 };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bi());
    }

    /* Testing the "p0Bi" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0BiNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0 };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi().getP0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Bi" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0BiNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateBinary.Aggregate0Bi.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Bi());
    }

    /* Testing the "p0Bi" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0BiNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final byte[] testValue = new byte[] { Byte.MIN_VALUE, 0, Byte.MAX_VALUE };
        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregate =
                new ocd.AggregateSurrogateBinary.Aggregate0Bi()
                .setP0Bi(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Bi().getP0Bi());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        final ocd.AggregateSurrogateBinary.Aggregate0Bi aggregateFound =
                ocd.AggregateSurrogateBinary.Aggregate0Bi.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.BinaryAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Bi());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
