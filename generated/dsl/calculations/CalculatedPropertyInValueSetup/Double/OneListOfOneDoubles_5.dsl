module CalculatedPropertyInValueSetup
{
  value OneListOfOneDoubles_5 {
    List<Double> oneListOfOneDoubles;

    calculated List<Double> calculatedOneListOfOneDoubles from 'it => it.oneListOfOneDoubles';

    calculated List<Double> persistedOneListOfOneDoubles from 'it => it.oneListOfOneDoubles' { persisted; }
  }
}
