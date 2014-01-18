module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneFloats_4 {
    Set<Float> oneSetOfOneFloats;

    calculated Set<Float> calculatedOneSetOfOneFloats from 'it => it.oneSetOfOneFloats';

    calculated Set<Float> persistedOneSetOfOneFloats from 'it => it.oneSetOfOneFloats' { persisted; }
  }
}
