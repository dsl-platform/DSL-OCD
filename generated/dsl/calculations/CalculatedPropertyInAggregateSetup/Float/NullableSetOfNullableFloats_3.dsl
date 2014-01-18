module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableFloats_3 {
    Set<Float?>? nullableSetOfNullableFloats;

    calculated Set<Float?>? calculatedNullableSetOfNullableFloats from 'it => it.nullableSetOfNullableFloats';

    calculated Set<Float?>? persistedNullableSetOfNullableFloats from 'it => it.nullableSetOfNullableFloats' { persisted; }
  }
}
