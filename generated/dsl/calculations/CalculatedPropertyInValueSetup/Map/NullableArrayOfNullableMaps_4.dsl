module CalculatedPropertyInValueSetup
{
  value NullableArrayOfNullableMaps_4 {
    Array<Map?>? nullableArrayOfNullableMaps;

    calculated Array<Map?>? calculatedNullableArrayOfNullableMaps from 'it => it.nullableArrayOfNullableMaps';

    calculated Array<Map?>? persistedNullableArrayOfNullableMaps from 'it => it.nullableArrayOfNullableMaps' { persisted; }
  }
}
