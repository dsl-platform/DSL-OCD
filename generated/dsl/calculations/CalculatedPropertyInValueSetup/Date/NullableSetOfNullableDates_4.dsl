module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableDates_4 {
    Set<Date?>? nullableSetOfNullableDates;

    calculated Set<Date?>? calculatedNullableSetOfNullableDates from 'it => it.nullableSetOfNullableDates';

    calculated Set<Date?>? persistedNullableSetOfNullableDates from 'it => it.nullableSetOfNullableDates' { persisted; }
  }
}
