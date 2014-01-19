module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneFloats_4 {
    Set<Float>? nullableSetOfOneFloats;

    calculated Set<Float>? calculatedNullableSetOfOneFloats from 'it => it.nullableSetOfOneFloats';

    calculated Set<Float>? persistedNullableSetOfOneFloats from 'it => it.nullableSetOfOneFloats' { persisted; }
  }
}
