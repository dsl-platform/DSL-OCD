module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneFloats_5 {
    Array<Float> oneArrayOfOneFloats;

    calculated Array<Float> calculatedOneArrayOfOneFloats from 'it => it.oneArrayOfOneFloats';

    calculated Array<Float> persistedOneArrayOfOneFloats from 'it => it.oneArrayOfOneFloats' { persisted; }
  }
}
