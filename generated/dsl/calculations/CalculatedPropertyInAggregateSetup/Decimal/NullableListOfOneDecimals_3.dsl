module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneDecimals_3 {
    List<Decimal>? nullableListOfOneDecimals;

    calculated List<Decimal>? calculatedNullableListOfOneDecimals from 'it => it.nullableListOfOneDecimals';

    calculated List<Decimal>? persistedNullableListOfOneDecimals from 'it => it.nullableListOfOneDecimals' { persisted; }
  }
}
