module CalculatedPropertyInValueSetup
{
  value NullableDate_4 {
    Date? nullableDate;

    calculated Date? calculatedNullableDate from 'it => it.nullableDate';

    calculated Date? persistedNullableDate from 'it => it.nullableDate' { persisted; }
  }
}
