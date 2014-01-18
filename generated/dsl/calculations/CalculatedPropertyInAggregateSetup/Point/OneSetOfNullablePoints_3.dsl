module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfNullablePoints_3 {
    Set<Point?> oneSetOfNullablePoints;

    calculated Set<Point?> calculatedOneSetOfNullablePoints from 'it => it.oneSetOfNullablePoints';

    calculated Set<Point?> persistedOneSetOfNullablePoints from 'it => it.oneSetOfNullablePoints' { persisted; }
  }
}
