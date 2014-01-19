module CalculatedPropertyInValueSetup
{
  value OneListOfNullableFloats_5 {
    List<Float?> oneListOfNullableFloats;

    calculated List<Float?> calculatedOneListOfNullableFloats from 'it => it.oneListOfNullableFloats';

    calculated List<Float?> persistedOneListOfNullableFloats from 'it => it.oneListOfNullableFloats' { persisted; }
  }
}
