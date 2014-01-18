module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableMaps_3 {
    List<Map?>? nullableListOfNullableMaps;

    calculated List<Map?>? calculatedNullableListOfNullableMaps from 'it => it.nullableListOfNullableMaps';

    calculated List<Map?>? persistedNullableListOfNullableMaps from 'it => it.nullableListOfNullableMaps' { persisted; }
  }
}
