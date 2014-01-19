module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneDates_4 {
    Set<Date>? nullableSetOfOneDates;

    calculated Set<Date>? calculatedNullableSetOfOneDates from 'it => it.nullableSetOfOneDates';

    calculated Set<Date>? persistedNullableSetOfOneDates from 'it => it.nullableSetOfOneDates' { persisted; }
  }
}
