module CalculatedPropertyInValueSetup
{
  value OneSetOfNullableBooleans_5 {
    Set<Boolean?> oneSetOfNullableBooleans;

    calculated Set<Boolean?> calculatedOneSetOfNullableBooleans from 'it => it.oneSetOfNullableBooleans';

    calculated Set<Boolean?> persistedOneSetOfNullableBooleans from 'it => it.oneSetOfNullableBooleans' { persisted; }
  }
}
