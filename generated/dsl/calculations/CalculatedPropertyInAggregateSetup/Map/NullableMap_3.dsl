module CalculatedPropertyInAggregateSetup
{
  aggregate NullableMap_3 {
    Map? nullableMap;

    calculated Map? calculatedNullableMap from 'it => it.nullableMap';

    calculated Map? persistedNullableMap from 'it => it.nullableMap' { persisted; }
  }
}
