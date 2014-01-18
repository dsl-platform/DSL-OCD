module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableStrings_3 {
    Set<String?>? nullableSetOfNullableStrings;

    calculated Set<String?>? calculatedNullableSetOfNullableStrings from 'it => it.nullableSetOfNullableStrings';

    calculated Set<String?>? persistedNullableSetOfNullableStrings from 'it => it.nullableSetOfNullableStrings' { persisted; }
  }
}
