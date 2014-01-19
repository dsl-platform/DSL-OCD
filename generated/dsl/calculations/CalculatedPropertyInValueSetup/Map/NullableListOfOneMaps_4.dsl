module CalculatedPropertyInValueSetup
{
  value NullableListOfOneMaps_4 {
    List<Map>? nullableListOfOneMaps;

    calculated List<Map>? calculatedNullableListOfOneMaps from 'it => it.nullableListOfOneMaps';

    calculated List<Map>? persistedNullableListOfOneMaps from 'it => it.nullableListOfOneMaps' { persisted; }
  }
}
