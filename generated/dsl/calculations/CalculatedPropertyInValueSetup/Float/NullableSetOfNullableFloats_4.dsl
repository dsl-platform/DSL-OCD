module CalculatedPropertyInValueSetup
{
  value NullableSetOfNullableFloats_4 {
    Set<Float?>? nullableSetOfNullableFloats;

    calculated Set<Float?>? calculatedNullableSetOfNullableFloats from 'it => it.nullableSetOfNullableFloats';

    calculated Set<Float?>? persistedNullableSetOfNullableFloats from 'it => it.nullableSetOfNullableFloats' { persisted; }
  }
}
