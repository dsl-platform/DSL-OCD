module CalculatedPropertyInValueSetup
{
  value NullableMap_4 {
    Map? nullableMap;

    calculated Map? calculatedNullableMap from 'it => it.nullableMap';

    calculated Map? persistedNullableMap from 'it => it.nullableMap' { persisted; }
  }
}
