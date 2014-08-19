package com.dslplatform.ocd.aggregates;

import java.io.IOException;

public class AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableMoniesPropertyTest {

    private static com.dslplatform.client.JsonSerialization jsonSerialization;
    private static com.dslplatform.patterns.PersistableRepository<ocd.AggregateSurrogateMoney.Aggregate0A0Mo> aggregate0A0MoRepository;

    @org.junit.BeforeClass
    public static void initialize() throws IOException {
        final com.dslplatform.patterns.ServiceLocator locator = com.dslplatform.client.Bootstrap.init(AggregateTypeWithSurrogateKeyAndNullableArrayOfNullableMoniesPropertyTest.class.getResourceAsStream("/dsl-project.ini"));
        jsonSerialization = locator.resolve(com.dslplatform.client.JsonSerialization.class);
        aggregate0A0MoRepository = locator.resolve(ocd.AggregateSurrogateMoney.repositories.Aggregate0A0MoRepository.class);
    }

    /* Testing the "p0A0Mo" Default aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoDefaultPropertyInAggregateJsonSerialization() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo();
        final java.math.BigDecimal[] testValue = aggregate.getP0A0Mo();

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" Default property value after active record persist */
    @org.junit.Test
    public void testP0A0MoDefaultPropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo();
        final java.math.BigDecimal[] testValue = aggregate.getP0A0Mo();

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Mo" NonDefault1 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoNonDefault1PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { null };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" NonDefault1 property value after active record persist */
    @org.junit.Test
    public void testP0A0MoNonDefault1PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { null };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Mo" NonDefault2 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoNonDefault2PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { java.math.BigDecimal.ZERO.setScale(2) };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" NonDefault2 property value after active record persist */
    @org.junit.Test
    public void testP0A0MoNonDefault2PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { java.math.BigDecimal.ZERO.setScale(2) };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Mo" NonDefault3 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoNonDefault3PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" NonDefault3 property value after active record persist */
    @org.junit.Test
    public void testP0A0MoNonDefault3PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Mo" NonDefault4 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoNonDefault4PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { java.math.BigDecimal.ZERO.setScale(2), java.math.BigDecimal.ONE, new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP), new java.math.BigDecimal("-1E-2"), new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" NonDefault4 property value after active record persist */
    @org.junit.Test
    public void testP0A0MoNonDefault4PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { java.math.BigDecimal.ZERO.setScale(2), java.math.BigDecimal.ONE, new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP), new java.math.BigDecimal("-1E-2"), new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }

    /* Testing the "p0A0Mo" NonDefault5 aggregate property JSON serialization */
    @org.junit.Test
    public void testP0A0MoNonDefault5PropertyInAggregateJsonSerialization() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { null, java.math.BigDecimal.ZERO.setScale(2), java.math.BigDecimal.ONE, new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP), new java.math.BigDecimal("-1E-2"), new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // check that the property was properly assigned
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo());

        final String serialized = com.dslplatform.client.JsonSerialization.serialize(aggregate);
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateDeserialized = jsonSerialization.deserialize(
                com.dslplatform.client.JsonSerialization.buildType(ocd.AggregateSurrogateMoney.Aggregate0A0Mo.class),
                serialized);

        // check that the property was properly deserialized
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateDeserialized.getP0A0Mo());
    }

    /* Testing the "p0A0Mo" NonDefault5 property value after active record persist */
    @org.junit.Test
    public void testP0A0MoNonDefault5PropertyValueInAggregateAfterActiveRecordPersist() throws java.io.IOException {
        final java.math.BigDecimal[] testValue = new java.math.BigDecimal[] { null, java.math.BigDecimal.ZERO.setScale(2), java.math.BigDecimal.ONE, new java.math.BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679").setScale(2, java.math.BigDecimal.ROUND_HALF_UP), new java.math.BigDecimal("-1E-2"), new java.math.BigDecimal("1E19") };
        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregate =
                new ocd.AggregateSurrogateMoney.Aggregate0A0Mo()
                .setP0A0Mo(testValue);

        // persist via active record pattern
        aggregate.persist();

        // check that the property retrieved from revenj (persist will mutate the aggregate)
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregate.getP0A0Mo().getP0A0Mo());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        final ocd.AggregateSurrogateMoney.Aggregate0A0Mo aggregateFound =
                ocd.AggregateSurrogateMoney.Aggregate0A0Mo.find(aggregate.getURI());

        // check the property retrieved from the database
        com.dslplatform.ocd.javaasserts.MoneyAsserts.assertNullableArrayOfNullableEquals(
                testValue,
                aggregateFound.getP0A0Mo());

        // aggregates are compared via URI equality - both URIs have be initialized at this point
        org.junit.Assert.assertEquals(aggregate, aggregateFound);

        // hashCodes are generated from the URI
        org.junit.Assert.assertEquals(aggregate.hashCode(), aggregateFound.hashCode());
    }
}
