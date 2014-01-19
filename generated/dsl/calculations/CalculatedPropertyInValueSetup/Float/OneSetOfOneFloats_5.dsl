module CalculatedPropertyInValueSetup
{
  value OneSetOfOneFloats_5 {
    Set<Float> oneSetOfOneFloats;

    calculated Set<Float> calculatedOneSetOfOneFloats from 'it => it.oneSetOfOneFloats';

    calculated Set<Float> persistedOneSetOfOneFloats from 'it => it.oneSetOfOneFloats' { persisted; }
  }
}
