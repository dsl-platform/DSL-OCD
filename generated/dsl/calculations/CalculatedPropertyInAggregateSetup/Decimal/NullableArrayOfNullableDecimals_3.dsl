module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableDecimals_3 {
    Array<Decimal?>? nullableArrayOfNullableDecimals;

    calculated Array<Decimal?>? calculatedNullableArrayOfNullableDecimals from 'it => it.nullableArrayOfNullableDecimals';

    calculated Array<Decimal?>? persistedNullableArrayOfNullableDecimals from 'it => it.nullableArrayOfNullableDecimals' { persisted; }
  }
}
