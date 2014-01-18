module CalculatedPropertyInAggregateSetup
{
  aggregate OneArrayOfOneBinaries_4 {
    Array<Binary> oneArrayOfOneBinaries;

    calculated Array<Binary> calculatedOneArrayOfOneBinaries from 'it => it.oneArrayOfOneBinaries';

    calculated Array<Binary> persistedOneArrayOfOneBinaries from 'it => it.oneArrayOfOneBinaries' { persisted; }
  }
}
