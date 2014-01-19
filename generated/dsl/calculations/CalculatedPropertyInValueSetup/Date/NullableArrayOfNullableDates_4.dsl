module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableDates_4 {
    Array<Date?>? nullableArrayOfNullableDates;

    calculated Array<Date?>? calculatedNullableArrayOfNullableDates from 'it => it.nullableArrayOfNullableDates';

    calculated Array<Date?>? persistedNullableArrayOfNullableDates from 'it => it.nullableArrayOfNullableDates' { persisted; }
  }
}
