module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneMaps_4 {
    Set<Map>? nullableSetOfOneMaps;

    calculated Set<Map>? calculatedNullableSetOfOneMaps from 'it => it.nullableSetOfOneMaps';

    calculated Set<Map>? persistedNullableSetOfOneMaps from 'it => it.nullableSetOfOneMaps' { persisted; }
  }
}