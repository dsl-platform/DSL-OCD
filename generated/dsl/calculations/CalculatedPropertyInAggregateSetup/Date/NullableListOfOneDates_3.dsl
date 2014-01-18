module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneDates_3 {
    List<Date>? nullableListOfOneDates;

    calculated List<Date>? calculatedNullableListOfOneDates from 'it => it.nullableListOfOneDates';

    calculated List<Date>? persistedNullableListOfOneDates from 'it => it.nullableListOfOneDates' { persisted; }
  }
}
