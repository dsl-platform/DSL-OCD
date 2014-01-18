module CalculatedPropertyInAggregateSetup
{
  aggregate OneListOfOneBinaries_4 {
    List<Binary> oneListOfOneBinaries;

    calculated List<Binary> calculatedOneListOfOneBinaries from 'it => it.oneListOfOneBinaries';

    calculated List<Binary> persistedOneListOfOneBinaries from 'it => it.oneListOfOneBinaries' { persisted; }
  }
}
