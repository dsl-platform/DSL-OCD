module CalculatedPropertyInValueSetup
{
  value NullableArrayOfOneMaps_4 {
    Array<Map>? nullableArrayOfOneMaps;

    calculated Array<Map>? calculatedNullableArrayOfOneMaps from 'it => it.nullableArrayOfOneMaps';

    calculated Array<Map>? persistedNullableArrayOfOneMaps from 'it => it.nullableArrayOfOneMaps' { persisted; }
  }
}
