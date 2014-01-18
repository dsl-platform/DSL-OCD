module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableFloats_4 {
    Set<Float?> oneSetOfNullableFloats;

    calculated Set<Float?> calculatedOneSetOfNullableFloats from 'it => it.oneSetOfNullableFloats';

    calculated Set<Float?> persistedOneSetOfNullableFloats from 'it => it.oneSetOfNullableFloats' { persisted; }
  }
}
