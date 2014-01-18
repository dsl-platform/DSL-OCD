module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneImages_4 {
    Set<Image> oneSetOfOneImages;

    calculated Set<Image> calculatedOneSetOfOneImages from 'it => it.oneSetOfOneImages';

    calculated Set<Image> persistedOneSetOfOneImages from 'it => it.oneSetOfOneImages' { persisted; }
  }
}
