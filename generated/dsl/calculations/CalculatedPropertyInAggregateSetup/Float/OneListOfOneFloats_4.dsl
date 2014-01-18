module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneFloats_4 {
    List<Float> oneListOfOneFloats;

    calculated List<Float> calculatedOneListOfOneFloats from 'it => it.oneListOfOneFloats';

    calculated List<Float> persistedOneListOfOneFloats from 'it => it.oneListOfOneFloats' { persisted; }
  }
}
