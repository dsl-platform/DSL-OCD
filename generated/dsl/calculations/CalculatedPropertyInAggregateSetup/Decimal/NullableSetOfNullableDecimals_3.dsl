module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableDecimals_3 {
    Set<Decimal?>? nullableSetOfNullableDecimals;

    calculated Set<Decimal?>? calculatedNullableSetOfNullableDecimals from 'it => it.nullableSetOfNullableDecimals';

    calculated Set<Decimal?>? persistedNullableSetOfNullableDecimals from 'it => it.nullableSetOfNullableDecimals' { persisted; }
  }
}
