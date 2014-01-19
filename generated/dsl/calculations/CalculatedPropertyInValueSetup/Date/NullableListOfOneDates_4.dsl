module CalculatedPropertyInValueSetup
{
  value NullableListOfOneDates_4 {
    List<Date>? nullableListOfOneDates;

    calculated List<Date>? calculatedNullableListOfOneDates from 'it => it.nullableListOfOneDates';

    calculated List<Date>? persistedNullableListOfOneDates from 'it => it.nullableListOfOneDates' { persisted; }
  }
}
