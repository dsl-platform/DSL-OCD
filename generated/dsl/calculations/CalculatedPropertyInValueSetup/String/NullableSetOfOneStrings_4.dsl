module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneStrings_4 {
    Set<String>? nullableSetOfOneStrings;

    calculated Set<String>? calculatedNullableSetOfOneStrings from 'it => it.nullableSetOfOneStrings';

    calculated Set<String>? persistedNullableSetOfOneStrings from 'it => it.nullableSetOfOneStrings' { persisted; }
  }
}
