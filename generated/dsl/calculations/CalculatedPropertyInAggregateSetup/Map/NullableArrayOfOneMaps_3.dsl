module CalculatedPropertyInAggregateSetup
{
  aggregate NullableArrayOfOneMaps_3 {
    Array<Map>? nullableArrayOfOneMaps;

    calculated Array<Map>? calculatedNullableArrayOfOneMaps from 'it => it.nullableArrayOfOneMaps';

    calculated Array<Map>? persistedNullableArrayOfOneMaps from 'it => it.nullableArrayOfOneMaps' { persisted; }
  }
}
