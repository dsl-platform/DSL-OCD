module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullableBinaries_4 {
    Set<Binary?> oneSetOfNullableBinaries;

    calculated Set<Binary?> calculatedOneSetOfNullableBinaries from 'it => it.oneSetOfNullableBinaries';

    calculated Set<Binary?> persistedOneSetOfNullableBinaries from 'it => it.oneSetOfNullableBinaries' { persisted; }
  }
}
