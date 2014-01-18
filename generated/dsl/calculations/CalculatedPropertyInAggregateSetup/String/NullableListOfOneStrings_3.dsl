module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfOneStrings_3 {
    List<String>? nullableListOfOneStrings;

    calculated List<String>? calculatedNullableListOfOneStrings from 'it => it.nullableListOfOneStrings';

    calculated List<String>? persistedNullableListOfOneStrings from 'it => it.nullableListOfOneStrings' { persisted; }
  }
}
