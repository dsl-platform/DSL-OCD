module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneDates_4 {
    Array<Date>? nullableArrayOfOneDates;

    calculated Array<Date>? calculatedNullableArrayOfOneDates from 'it => it.nullableArrayOfOneDates';

    calculated Array<Date>? persistedNullableArrayOfOneDates from 'it => it.nullableArrayOfOneDates' { persisted; }
  }
}
