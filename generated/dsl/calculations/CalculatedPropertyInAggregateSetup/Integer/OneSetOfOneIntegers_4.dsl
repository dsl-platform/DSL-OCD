module CalculatedPropertyInAggregateSetup
{
  aggregate OneSetOfOneIntegers_4 {
    Set<Integer> oneSetOfOneIntegers;

    calculated Set<Integer> calculatedOneSetOfOneIntegers from 'it => it.oneSetOfOneIntegers';

    calculated Set<Integer> persistedOneSetOfOneIntegers from 'it => it.oneSetOfOneIntegers' { persisted; }
  }
}
