module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfNullableFloats_4 {
    Array<Float?> oneArrayOfNullableFloats;

    calculated Array<Float?> calculatedOneArrayOfNullableFloats from 'it => it.oneArrayOfNullableFloats';

    calculated Array<Float?> persistedOneArrayOfNullableFloats from 'it => it.oneArrayOfNullableFloats' { persisted; }
  }
}
