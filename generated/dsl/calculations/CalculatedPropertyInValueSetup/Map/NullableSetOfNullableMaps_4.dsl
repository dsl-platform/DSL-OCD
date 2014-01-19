module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableMaps_4 {
    Set<Map?>? nullableSetOfNullableMaps;

    calculated Set<Map?>? calculatedNullableSetOfNullableMaps from 'it => it.nullableSetOfNullableMaps';

    calculated Set<Map?>? persistedNullableSetOfNullableMaps from 'it => it.nullableSetOfNullableMaps' { persisted; }
  }
}
