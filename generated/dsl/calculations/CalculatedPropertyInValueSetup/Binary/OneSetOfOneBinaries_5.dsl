module CalculatedPropertyInValueSetup
{
  value OneSetOfOneBinaries_5 {
    Set<Binary> oneSetOfOneBinaries;

    calculated Set<Binary> calculatedOneSetOfOneBinaries from 'it => it.oneSetOfOneBinaries';

    calculated Set<Binary> persistedOneSetOfOneBinaries from 'it => it.oneSetOfOneBinaries' { persisted; }
  }
}
