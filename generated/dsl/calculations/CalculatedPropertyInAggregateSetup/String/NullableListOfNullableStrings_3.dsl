module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableStrings_3 {
    List<String?>? nullableListOfNullableStrings;

    calculated List<String?>? calculatedNullableListOfNullableStrings from 'it => it.nullableListOfNullableStrings';

    calculated List<String?>? persistedNullableListOfNullableStrings from 'it => it.nullableListOfNullableStrings' { persisted; }
  }
}
