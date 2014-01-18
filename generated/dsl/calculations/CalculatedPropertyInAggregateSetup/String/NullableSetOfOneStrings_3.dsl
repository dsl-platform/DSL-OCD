module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneStrings_3 {
    Set<String>? nullableSetOfOneStrings;

    calculated Set<String>? calculatedNullableSetOfOneStrings from 'it => it.nullableSetOfOneStrings';

    calculated Set<String>? persistedNullableSetOfOneStrings from 'it => it.nullableSetOfOneStrings' { persisted; }
  }
}
