package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableFloatsPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0A0Fl> aggregate0A0FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableFloatsPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0A0FlRepository.class);
    }

    /* Testing the "p0A0Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl();
        final Float[] testValue = aggregate.getP0A0Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl();
        final Float[] testValue = aggregate.getP0A0Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { null };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { null };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float[] testValue = new Float[] { null, 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0A0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Fl());
    }

    /* Testing the "p0A0Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0A0FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float[] testValue = new Float[] { null, 0.0f, -1.2345E-10f, 1.2345E20f, -1E-5f, Float.NaN, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY };
        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0A0Fl()
                .setP0A0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Fl().getP0A0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0A0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0A0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
