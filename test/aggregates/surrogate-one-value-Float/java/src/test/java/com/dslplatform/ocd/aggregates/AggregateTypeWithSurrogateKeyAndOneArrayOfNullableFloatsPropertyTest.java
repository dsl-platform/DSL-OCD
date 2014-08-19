package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndOneArrayOfNullableFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate1A0Fl> aggregate1A0FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndOneArrayOfNullableFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate1A0FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate1A0FlRepository.class);
    }

    /* Testing the "p1A0Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl();
        final Float[] testValue = aggregate.getP1A0Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP1A0FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl();
        final Float[] testValue = aggregate.getP1A0Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { null };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP1A0FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { null };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP1A0FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP1A0FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP1A0FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p1A0Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP1A0FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { null, 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate1A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP1A0Fl());
    }

    /* Testing the "p1A0Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP1A0FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { null, 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate1A0Fl()
                .setP1A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregate.getP1A0Fl().getP1A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate1A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate1A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertOneArrayOfNullableEquals(
                testValue,
                aggregateFound.getP1A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
