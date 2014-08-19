package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfOneFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0A1Fl> aggregate0A1FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfOneFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A1FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0A1FlRepository.class);
    }

    /* Testing the "p0A1Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl();
        final float[] testValue = aggregate.getP0A1Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Fl());
    }

    /* Testing the "p0A1Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0A1FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl();
        final float[] testValue = aggregate.getP0A1Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl().getP0A1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float[] testValue = new float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Fl());
    }

    /* Testing the "p0A1Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A1FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float[] testValue = new float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl().getP0A1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float[] testValue = new float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Fl());
    }

    /* Testing the "p0A1Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A1FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float[] testValue = new float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl().getP0A1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A1Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A1FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final float[] testValue = new float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A1Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateDeserialized.getP0A1Fl());
    }

    /* Testing the "p0A1Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A1FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final float[] testValue = new float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A1Fl()
                .setP0A1Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregate.getP0A1Fl().getP0A1Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A1Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A1Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfOneEquals(
                testValue,
                aggregateFound.getP0A1Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
