module CalculatedPropertyInAggregateSetup
{
  aggregate NullableDate_3 {
    Date? nullableDate;

    calculated Date? calculatedNullableDate from 'it => it.nullableDate';

    calculated Date? persistedNullableDate from 'it => it.nullableDate' { persisted; }
  }
}
