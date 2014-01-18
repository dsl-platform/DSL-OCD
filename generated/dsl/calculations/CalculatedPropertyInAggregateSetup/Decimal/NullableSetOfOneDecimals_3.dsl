module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneDecimals_3 {
    Set<Decimal>? nullableSetOfOneDecimals;

    calculated Set<Decimal>? calculatedNullableSetOfOneDecimals from 'it => it.nullableSetOfOneDecimals';

    calculated Set<Decimal>? persistedNullableSetOfOneDecimals from 'it => it.nullableSetOfOneDecimals' { persisted; }
  }
}
