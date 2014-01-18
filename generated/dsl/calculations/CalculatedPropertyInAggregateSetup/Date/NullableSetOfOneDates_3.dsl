module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneDates_3 {
    Set<Date>? nullableSetOfOneDates;

    calculated Set<Date>? calculatedNullableSetOfOneDates from 'it => it.nullableSetOfOneDates';

    calculated Set<Date>? persistedNullableSetOfOneDates from 'it => it.nullableSetOfOneDates' { persisted; }
  }
}
