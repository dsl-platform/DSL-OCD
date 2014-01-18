module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableDecimals_3 {
    List<Decimal?>? nullableListOfNullableDecimals;

    calculated List<Decimal?>? calculatedNullableListOfNullableDecimals from 'it => it.nullableListOfNullableDecimals';

    calculated List<Decimal?>? persistedNullableListOfNullableDecimals from 'it => it.nullableListOfNullableDecimals' { persisted; }
  }
}
