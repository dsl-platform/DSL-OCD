module CalculatedPropertyInValueSetup
{
  value OneListOfNullableBinaries_5 {
    List<Binary?> oneListOfNullableBinaries;

    calculated List<Binary?> calculatedOneListOfNullableBinaries from 'it => it.oneListOfNullableBinaries';

    calculated List<Binary?> persistedOneListOfNullableBinaries from 'it => it.oneListOfNullableBinaries' { persisted; }
  }
}
