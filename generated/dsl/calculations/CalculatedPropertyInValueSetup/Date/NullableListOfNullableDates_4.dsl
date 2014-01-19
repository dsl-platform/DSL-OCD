module CalculatedPropertyInValueSetup
{
  value NullableListOfNullableDates_4 {
    List<Date?>? nullableListOfNullableDates;

    calculated List<Date?>? calculatedNullableListOfNullableDates from 'it => it.nullableListOfNullableDates';

    calculated List<Date?>? persistedNullableListOfNullableDates from 'it => it.nullableListOfNullableDates' { persisted; }
  }
}
