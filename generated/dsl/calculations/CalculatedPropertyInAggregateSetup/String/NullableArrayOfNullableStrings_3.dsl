module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfNullableStrings_3 {
    Array<String?>? nullableArrayOfNullableStrings;

    calculated Array<String?>? calculatedNullableArrayOfNullableStrings from 'it => it.nullableArrayOfNullableStrings';

    calculated Array<String?>? persistedNullableArrayOfNullableStrings from 'it => it.nullableArrayOfNullableStrings' { persisted; }
  }
}
