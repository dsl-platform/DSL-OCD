module CalculatedPropertyInValueSetup
{
  value OneArrayOfNullableBinaries_5 {
    Array<Binary?> oneArrayOfNullableBinaries;

    calculated Array<Binary?> calculatedOneArrayOfNullableBinaries from 'it => it.oneArrayOfNullableBinaries';

    calculated Array<Binary?> persistedOneArrayOfNullableBinaries from 'it => it.oneArrayOfNullableBinaries' { persisted; }
  }
}
