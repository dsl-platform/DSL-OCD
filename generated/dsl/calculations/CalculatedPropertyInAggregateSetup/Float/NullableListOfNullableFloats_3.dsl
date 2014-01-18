module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableFloats_3 {
    List<Float?>? nullableListOfNullableFloats;

    calculated List<Float?>? calculatedNullableListOfNullableFloats from 'it => it.nullableListOfNullableFloats';

    calculated List<Float?>? persistedNullableListOfNullableFloats from 'it => it.nullableListOfNullableFloats' { persisted; }
  }
}
