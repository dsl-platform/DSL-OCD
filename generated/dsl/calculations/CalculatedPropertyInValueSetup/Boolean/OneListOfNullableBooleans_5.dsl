module CalculatedPropertyInValueSetup
{
  value OneListOfNullableBooleans_5 {
    List<Boolean?> oneListOfNullableBooleans;

    calculated List<Boolean?> calculatedOneListOfNullableBooleans from 'it => it.oneListOfNullableBooleans';

    calculated List<Boolean?> persistedOneListOfNullableBooleans from 'it => it.oneListOfNullableBooleans' { persisted; }
  }
}
