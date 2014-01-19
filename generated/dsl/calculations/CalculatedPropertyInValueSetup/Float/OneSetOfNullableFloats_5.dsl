module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableFloats_5 {
    Set<Float?> oneSetOfNullableFloats;

    calculated Set<Float?> calculatedOneSetOfNullableFloats from 'it => it.oneSetOfNullableFloats';

    calculated Set<Float?> persistedOneSetOfNullableFloats from 'it => it.oneSetOfNullableFloats' { persisted; }
  }
}
