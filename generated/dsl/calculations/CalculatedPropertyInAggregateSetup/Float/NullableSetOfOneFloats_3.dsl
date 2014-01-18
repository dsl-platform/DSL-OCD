module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneFloats_3 {
    Set<Float>? nullableSetOfOneFloats;

    calculated Set<Float>? calculatedNullableSetOfOneFloats from 'it => it.nullableSetOfOneFloats';

    calculated Set<Float>? persistedNullableSetOfOneFloats from 'it => it.nullableSetOfOneFloats' { persisted; }
  }
}
