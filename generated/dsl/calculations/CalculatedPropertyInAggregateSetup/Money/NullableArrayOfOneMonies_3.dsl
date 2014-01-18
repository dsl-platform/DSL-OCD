module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneMonies_3 {
    Array<Money>? nullableArrayOfOneMonies;

    calculated Array<Money>? calculatedNullableArrayOfOneMonies from 'it => it.nullableArrayOfOneMonies';

    calculated Array<Money>? persistedNullableArrayOfOneMonies from 'it => it.nullableArrayOfOneMonies' { persisted; }
  }
}
