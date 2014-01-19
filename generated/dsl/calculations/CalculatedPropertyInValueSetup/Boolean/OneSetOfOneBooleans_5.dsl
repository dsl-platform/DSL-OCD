module CalculatedPropertyInValueSetup
{
  value OneSetOfOneBooleans_5 {
    Set<Boolean> oneSetOfOneBooleans;

    calculated Set<Boolean> calculatedOneSetOfOneBooleans from 'it => it.oneSetOfOneBooleans';

    calculated Set<Boolean> persistedOneSetOfOneBooleans from 'it => it.oneSetOfOneBooleans' { persisted; }
  }
}
