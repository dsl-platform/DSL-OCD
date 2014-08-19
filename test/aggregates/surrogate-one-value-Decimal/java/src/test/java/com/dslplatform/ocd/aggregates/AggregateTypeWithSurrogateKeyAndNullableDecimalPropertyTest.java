package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableDecimalPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateDecimal.Aggregate0De> aggregate0DeRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableDecimalPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0DeRepository = locator.resolve(ocd.AggregateSurrogateDecimal.repositories.Aggregate0DeRepository.class);
    }

    /* Testing the "p0De" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De();
        final java.math.BigDecimal testValue = aggregate.getP0De();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" Default property value after active record persist */
    @org.junit.Test
    public void testP0DeDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De();
        final java.math.BigDecimal testValue = aggregate.getP0De();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0De" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ZERO;
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0DeNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ZERO;
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0De" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ONE;
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0DeNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = java.math.BigDecimal.ONE;
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0De" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0DeNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(28, java.math.BigDecimal.ROUND_HALF_UP);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0De" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("-1E-28");
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0DeNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("-1E-28");
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0De" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0DeNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("1E28");
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateDecimal.Aggregate0De.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateDeserialized.getP0De());
    }

    /* Testing the "p0De" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0DeNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal testValue = new java.math.BigDecimal("1E28");
        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregate =
                new ocd.AggregateSurrogateDecimal.Aggregate0De()
                .setP0De(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregate.getP0De().getP0De());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        final ocd.AggregateSurrogateDecimal.Aggregate0De aggregateFound =
                ocd.AggregateSurrogateDecimal.Aggregate0De.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.DecimalAsserts.assertNullableEquals(
                testValue,
                aggregateFound.getP0De());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
