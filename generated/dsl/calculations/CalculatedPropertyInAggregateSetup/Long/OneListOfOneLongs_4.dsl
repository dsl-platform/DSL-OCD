module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneLongs_4 {
    List<Long> oneListOfOneLongs;

    calculated List<Long> calculatedOneListOfOneLongs from 'it => it.oneListOfOneLongs';

    calculated List<Long> persistedOneListOfOneLongs from 'it => it.oneListOfOneLongs' { persisted; }
  }
}
