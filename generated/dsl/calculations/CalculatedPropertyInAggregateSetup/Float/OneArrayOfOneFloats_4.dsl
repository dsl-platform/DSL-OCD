module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneFloats_4 {
    Array<Float> oneArrayOfOneFloats;

    calculated Array<Float> calculatedOneArrayOfOneFloats from 'it => it.oneArrayOfOneFloats';

    calculated Array<Float> persistedOneArrayOfOneFloats from 'it => it.oneArrayOfOneFloats' { persisted; }
  }
}
