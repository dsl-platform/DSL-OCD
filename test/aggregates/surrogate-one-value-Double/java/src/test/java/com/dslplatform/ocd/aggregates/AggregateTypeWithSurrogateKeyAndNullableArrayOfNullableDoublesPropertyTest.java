package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableDoublesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDouble.Aggregate0A0Do> aggregate0A0DoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableDoublesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0DoRepository = locator.resolve(ocd.AggregateSurrogateDouble.repositories.Aggregate0A0DoRepository.class);
    }

    /* Testing the "p0A0Do" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do();
        final Double[] testValue = aggregate.getP0A0Do();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0DoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do();
        final Double[] testValue = aggregate.getP0A0Do();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Do" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Double[] testValue = new Double[] { null };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0DoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Double[] testValue = new Double[] { null };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Do" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Double[] testValue = new Double[] { 0.0 };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0DoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Double[] testValue = new Double[] { 0.0 };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Do" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Double[] testValue = new Double[] { Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0DoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Double[] testValue = new Double[] { Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Do" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Double[] testValue = new Double[] { 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0DoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Double[] testValue = new Double[] { 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Do" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0DoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Double[] testValue = new Double[] { null, 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDouble.Aggregate0A0Do.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Do());
    }

    /* Testing the "p0A0Do" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0A0DoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Double[] testValue = new Double[] { null, 0.0, 1E-307, 9E307, -1.23456789012345E-10, 1.23456789012345E20, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN };
        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregate =
                new ocd.AggregateSurrogateDouble.Aggregate0A0Do()
                .setP0A0Do(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Do().getP0A0Do());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        final ocd.AggregateSurrogateDouble.Aggregate0A0Do aggregateFound =
                ocd.AggregateSurrogateDouble.Aggregate0A0Do.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DoubleAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Do());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
