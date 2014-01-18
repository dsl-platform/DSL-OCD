module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneStrings_3 {
    Array<String>? nullableArrayOfOneStrings;

    calculated Array<String>? calculatedNullableArrayOfOneStrings from 'it => it.nullableArrayOfOneStrings';

    calculated Array<String>? persistedNullableArrayOfOneStrings from 'it => it.nullableArrayOfOneStrings' { persisted; }
  }
}
