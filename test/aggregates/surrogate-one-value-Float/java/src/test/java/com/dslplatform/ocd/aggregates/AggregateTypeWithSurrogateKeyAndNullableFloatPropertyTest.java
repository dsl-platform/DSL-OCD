package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableFloatPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateFloat.Aggregate0Fl> aggregate0FlRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableFloatPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0FlRepository = locator.resolve(ocd.AggregateSurrogateFloat.repositories.Aggregate0FlRepository.class);
    }

    /* Testing the "p0Fl" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl();
        final Float testValue = aggregate.getP0Fl();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" Default property value after active record persist */
    @org.junit.Test
    public void testP0FlDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl();
        final Float testValue = aggregate.getP0Fl();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = 0.0f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = 0.0f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = -1.2345E-10f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = -1.2345E-10f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = 1.2345E20f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = 1.2345E20f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = -1E-5f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = -1E-5f;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = Float.NaN;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = Float.NaN;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault6 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault6PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = Float.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault6 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault6PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = Float.NEGATIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0Fl" NonDefault7 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0FlNonDefault7PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final Float testValue = Float.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateFloat.Aggregate0Fl.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0Fl());
    }

    /* Testing the "p0Fl" NonDefault7 property value after active record persist */
    @org.junit.Test
    public void testP0FlNonDefault7PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final Float testValue = Float.POSITIVE_INFINITY;
        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregate =
                new ocd.AggregateSurrogateFloat.Aggregate0Fl()
                .setP0Fl(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0Fl().getP0Fl());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        final ocd.AggregateSurrogateFloat.Aggregate0Fl aggregateFound =
                ocd.AggregateSurrogateFloat.Aggregate0Fl.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.FloatAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0Fl());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
