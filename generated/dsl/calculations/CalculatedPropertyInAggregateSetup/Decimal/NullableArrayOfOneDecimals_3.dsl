module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneDecimals_3 {
    Array<Decimal>? nullableArrayOfOneDecimals;

    calculated Array<Decimal>? calculatedNullableArrayOfOneDecimals from 'it => it.nullableArrayOfOneDecimals';

    calculated Array<Decimal>? persistedNullableArrayOfOneDecimals from 'it => it.nullableArrayOfOneDecimals' { persisted; }
  }
}
