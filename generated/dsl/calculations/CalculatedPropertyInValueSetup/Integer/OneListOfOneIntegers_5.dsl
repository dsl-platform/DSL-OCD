module CalculatedPropertyInValueSetup
{
  value OneListOfOneIntegers_5 {
    List<Integer> oneListOfOneIntegers;

    calculated List<Integer> calculatedOneListOfOneIntegers from 'it => it.oneListOfOneIntegers';

    calculated List<Integer> persistedOneListOfOneIntegers from 'it => it.oneListOfOneIntegers' { persisted; }
  }
}
