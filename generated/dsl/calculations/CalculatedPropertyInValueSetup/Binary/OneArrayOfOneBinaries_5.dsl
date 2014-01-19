module CalculatedPropertyInValueSetup
{
  value OneArrayOfOneBinaries_5 {
    Array<Binary> oneArrayOfOneBinaries;

    calculated Array<Binary> calculatedOneArrayOfOneBinaries from 'it => it.oneArrayOfOneBinaries';

    calculated Array<Binary> persistedOneArrayOfOneBinaries from 'it => it.oneArrayOfOneBinaries' { persisted; }
  }
}
