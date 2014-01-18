module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfNullableFloats_4 {
    List<Float?> oneListOfNullableFloats;

    calculated List<Float?> calculatedOneListOfNullableFloats from 'it => it.oneListOfNullableFloats';

    calculated List<Float?> persistedOneListOfNullableFloats from 'it => it.oneListOfNullableFloats' { persisted; }
  }
}
