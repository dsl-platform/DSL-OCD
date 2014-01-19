module CalculatedPropertyInValueSetup
{
  value OneListOfOneBooleans_5 {
    List<Boolean> oneListOfOneBooleans;

    calculated List<Boolean> calculatedOneListOfOneBooleans from 'it => it.oneListOfOneBooleans';

    calculated List<Boolean> persistedOneListOfOneBooleans from 'it => it.oneListOfOneBooleans' { persisted; }
  }
}
